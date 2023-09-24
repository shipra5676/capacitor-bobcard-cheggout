# capacitor-bobcard-cheggout

Plugin to integrate native functionalities of Cheggout

## Install

```bash
npm install capacitor-bobcard-cheggout
npx cap sync
```

## API

<docgen-index>

* [`echo(...)`](#echo)
* [`launchSDK(...)`](#launchsdk)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### echo(...)

```typescript
echo(options: { value: string; }) => Promise<{ value: string; }>
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ value: string; }</code> |

**Returns:** <code>Promise&lt;{ value: string; }&gt;</code>

--------------------


### launchSDK(...)

```typescript
launchSDK(options: { virtualId: string; sessionId: string; payload: string; }) => Promise<{ message: string; }>
```

| Param         | Type                                                                    |
| ------------- | ----------------------------------------------------------------------- |
| **`options`** | <code>{ virtualId: string; sessionId: string; payload: string; }</code> |

**Returns:** <code>Promise&lt;{ message: string; }&gt;</code>

--------------------

</docgen-api>
