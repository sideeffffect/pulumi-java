// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.inputs.EdifactOneWayAgreementResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The Edifact agreement content.
 * 
 */
public final class EdifactAgreementContentResponse extends com.pulumi.resources.InvokeArgs {

    public static final EdifactAgreementContentResponse Empty = new EdifactAgreementContentResponse();

    /**
     * The EDIFACT one-way receive agreement.
     * 
     */
    @Import(name="receiveAgreement", required=true)
      private final EdifactOneWayAgreementResponse receiveAgreement;

    public EdifactOneWayAgreementResponse receiveAgreement() {
        return this.receiveAgreement;
    }

    /**
     * The EDIFACT one-way send agreement.
     * 
     */
    @Import(name="sendAgreement", required=true)
      private final EdifactOneWayAgreementResponse sendAgreement;

    public EdifactOneWayAgreementResponse sendAgreement() {
        return this.sendAgreement;
    }

    public EdifactAgreementContentResponse(
        EdifactOneWayAgreementResponse receiveAgreement,
        EdifactOneWayAgreementResponse sendAgreement) {
        this.receiveAgreement = Objects.requireNonNull(receiveAgreement, "expected parameter 'receiveAgreement' to be non-null");
        this.sendAgreement = Objects.requireNonNull(sendAgreement, "expected parameter 'sendAgreement' to be non-null");
    }

    private EdifactAgreementContentResponse() {
        this.receiveAgreement = null;
        this.sendAgreement = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactAgreementContentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdifactOneWayAgreementResponse receiveAgreement;
        private EdifactOneWayAgreementResponse sendAgreement;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactAgreementContentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.receiveAgreement = defaults.receiveAgreement;
    	      this.sendAgreement = defaults.sendAgreement;
        }

        public Builder receiveAgreement(EdifactOneWayAgreementResponse receiveAgreement) {
            this.receiveAgreement = Objects.requireNonNull(receiveAgreement);
            return this;
        }
        public Builder sendAgreement(EdifactOneWayAgreementResponse sendAgreement) {
            this.sendAgreement = Objects.requireNonNull(sendAgreement);
            return this;
        }        public EdifactAgreementContentResponse build() {
            return new EdifactAgreementContentResponse(receiveAgreement, sendAgreement);
        }
    }
}
