### 데이터 테이블 사용시 컬럼명을 동적으로 받을 때 구현한 방법

- java fields

```java
private String companyGroupName;
private Map<String, Long> entryMap;
private Map<String, Long> receiptMap;
```

- json

```json
args.data = [
    {
        "companyGroupName": "강서점",
        "entryMap": {
            // ...
            "이벤트": 0
        },
        "receiptMap": {
            "채널": 0
            // ...
        }
    },
    {
        "companyGroupName": "인천지점",
        "entryMap": {
            "카페": 1
            // ...
        },
        "receiptMap": {
            "앱": 0
            // ...
        }
    }
    // ...
]
```

- entryMap 안에 키 값의 수와 명칭이 동적으로 변할 수 있기 때문에 javascript딴에서 맵을 한 뎁스 더 풀어주느라 애를 먹었다.  
- 풀어준 데이터와 컬럼 명을 데이터 테이블에 내려서 사용하면 동적으로 사용할 수 있다.

```javascript
loadBuyingSurveyTable: (fStartDate, fEndDate) => {
  $.ajax({
    url: `/api/dashboard/test?fStartDate=${fStartDate}&fEndDate=${fEndDate}`,
    type: "GET",
    success: function (args) {
      if (!args.data) {
        return;
      } else {
        const buyingSurvey = args.data;

        let entryData = [];
        for (let i = 0; i < buyingSurvey.length; i++) {
          let obj = {
            total: 0
          };
          Object.keys(buyingSurvey[i]['entryMap']).forEach(key => {
            let entryMapValue = buyingSurvey[i]['entryMap'][key];
            obj.companyGroupName = buyingSurvey[i]['companyGroupName'];
            obj[key] = entryMapValue;
            obj.total += entryMapValue;
          });
          entryData.push(obj);
        }

        let entryColumns = [];
        let index = 1;
        entryColumns.push({data: Object.keys(buyingSurvey[0])[0], target: 0});
        for (var i in Object.values(buyingSurvey[0])[1]) {
          entryColumns.push({data: i, target: index++});
        }
        entryColumns.push({data: "total", target: index});

        MainTraceStat.loadBuyingEntryTable(entryData, entryColumns);
        MainTraceStat.loadBuyingReceiptTable(buyingSurvey);
      }
    },
  })
}
```

- datatable

```javascript
 $("#buyingEntryTable").DataTable({
  data: entryData,
  columns: entryColumns
})
```