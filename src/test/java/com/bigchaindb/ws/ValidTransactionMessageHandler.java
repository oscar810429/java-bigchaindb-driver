package com.bigchaindb.ws;

import com.bigchaindb.model.ValidTransaction;
import com.bigchaindb.util.JsonUtils;
import com.bigchaindb.ws.MessageHandler;

public class ValidTransactionMessageHandler implements MessageHandler {
	@Override
	public void handleMessage(String message) {
		ValidTransaction validTransaction = JsonUtils.fromJson(message, ValidTransaction.class);
	}
}
