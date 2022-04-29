// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetAccountAuditConfigurationArgs extends InvokeArgs {

    public static final GetAccountAuditConfigurationArgs Empty = new GetAccountAuditConfigurationArgs();

    /**
     * Your 12-digit account ID (used as the primary identifier for the CloudFormation resource).
     * 
     */
    @Import(name="accountId", required=true)
    private String accountId;

    /**
     * @return Your 12-digit account ID (used as the primary identifier for the CloudFormation resource).
     * 
     */
    public String accountId() {
        return this.accountId;
    }

    private GetAccountAuditConfigurationArgs() {}

    private GetAccountAuditConfigurationArgs(GetAccountAuditConfigurationArgs $) {
        this.accountId = $.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountAuditConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountAuditConfigurationArgs $;

        public Builder() {
            $ = new GetAccountAuditConfigurationArgs();
        }

        public Builder(GetAccountAuditConfigurationArgs defaults) {
            $ = new GetAccountAuditConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Your 12-digit account ID (used as the primary identifier for the CloudFormation resource).
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            $.accountId = accountId;
            return this;
        }

        public GetAccountAuditConfigurationArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            return $;
        }
    }

}
