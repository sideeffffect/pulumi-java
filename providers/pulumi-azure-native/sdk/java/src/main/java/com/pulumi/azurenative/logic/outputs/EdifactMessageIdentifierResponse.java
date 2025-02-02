// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EdifactMessageIdentifierResponse {
    /**
     * @return The message id on which this envelope settings has to be applied.
     * 
     */
    private final String messageId;

    @CustomType.Constructor
    private EdifactMessageIdentifierResponse(@CustomType.Parameter("messageId") String messageId) {
        this.messageId = messageId;
    }

    /**
     * @return The message id on which this envelope settings has to be applied.
     * 
     */
    public String messageId() {
        return this.messageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactMessageIdentifierResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String messageId;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactMessageIdentifierResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageId = defaults.messageId;
        }

        public Builder messageId(String messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }        public EdifactMessageIdentifierResponse build() {
            return new EdifactMessageIdentifierResponse(messageId);
        }
    }
}
