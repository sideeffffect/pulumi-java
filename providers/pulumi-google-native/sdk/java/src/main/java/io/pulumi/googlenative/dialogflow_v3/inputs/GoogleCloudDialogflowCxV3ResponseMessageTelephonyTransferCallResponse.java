// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Represents the signal that telles the client to transfer the phone call connected to the agent to a third-party endpoint.
 * 
 */
public final class GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse Empty = new GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse();

    /**
     * Transfer the call to a phone number in [E.164 format](https://en.wikipedia.org/wiki/E.164).
     * 
     */
    @InputImport(name="phoneNumber", required=true)
      private final String phoneNumber;

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse(String phoneNumber) {
        this.phoneNumber = Objects.requireNonNull(phoneNumber, "expected parameter 'phoneNumber' to be non-null");
    }

    private GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse() {
        this.phoneNumber = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }
        public GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse build() {
            return new GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse(phoneNumber);
        }
    }
}
