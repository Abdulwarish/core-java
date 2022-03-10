
public class ArrayMultidiminsional {

	public static void main(String[] args) {
		
//			int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
//			for(int i=0;i<=arr.length-1;i++) {
//				for(int j=0;j<=arr.length-1;j++) {
//					System.out.print(arr[i][j]+" ");
//				}
//				System.out.println();
//			}
		
		System.out.println("SELECT\r\n" + 
				"J.id,J.broker_uuid,J.created_at,K.pick_timestamp,J.ecol_transaction_id,U.id,U.status,U.transfer_type,U.transfer_unique_no,\r\n" + 
				"U.transfer_timestamp,U.transfer_ccy,U.transfer_amt,U.rmtr_full_name,U.rmtr_address,U.rmtr_account_type,U.rmtr_account_no,\r\n" + 
				"U.rmtr_account_ifsc,U.bene_full_name,U.bene_account_no,U.bene_account_ifsc,U.rmtr_to_bene_note,U.customer_code,U.invoice_no,U.remitter_code,\r\n" + 
				"U.created_at,U.customer_subcode,U.credit_attempt_no,U.bene_full_address,U.bene_account_type,U.credit_acct_no,U.returned_at,U.credit_ref,\r\n" + 
				"U.validation_ref,U.remarks,U.credited_at,U.validate_attempt_no,U.notify_attempt_no\r\n" + 
				"FROM\r\n" + 
				"ecol_pending_validations J\r\n" + 
				"LEFT JOIN\r\n" + 
				"ECOL_PEND_VALID_EXT K\r\n" + 
				"ON\r\n" + 
				"k.pend_validate_id=J.id\r\n" + 
				"LEFT JOIN\r\n" + 
				"ecol_transactions U\r\n" + 
				"ON\r\n" + 
				"J.ecol_transaction_id = U.id\r\n" + 
				"LEFT JOIN ecol_customers S\r\n" + 
				"ON U.customer_code = S.code and S.APPROVAL_STATUS = 'A' \r\n" + 
				"WHERE \r\n" +
				"(k.PICK_TIMESTAMP is null or K.pick_timestamp <= :pendReqInterval)\r\n" + 
				"AND\r\n" +
				"S.validate_process_by = 'ECOLLECT_MAPPER'\r\n" + 
				"AND\r\n" +  
				"ROWNUM<=200 order by J.created_at asc");
	}

}
