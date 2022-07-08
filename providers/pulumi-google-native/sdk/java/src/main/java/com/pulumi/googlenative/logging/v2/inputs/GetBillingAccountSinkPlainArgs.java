// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.logging.v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBillingAccountSinkPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBillingAccountSinkPlainArgs Empty = new GetBillingAccountSinkPlainArgs();

    @Import(name="billingAccountId", required=true)
    private String billingAccountId;

    public String billingAccountId() {
        return this.billingAccountId;
    }

    @Import(name="sinkId", required=true)
    private String sinkId;

    public String sinkId() {
        return this.sinkId;
    }

    private GetBillingAccountSinkPlainArgs() {}

    private GetBillingAccountSinkPlainArgs(GetBillingAccountSinkPlainArgs $) {
        this.billingAccountId = $.billingAccountId;
        this.sinkId = $.sinkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBillingAccountSinkPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBillingAccountSinkPlainArgs $;

        public Builder() {
            $ = new GetBillingAccountSinkPlainArgs();
        }

        public Builder(GetBillingAccountSinkPlainArgs defaults) {
            $ = new GetBillingAccountSinkPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder billingAccountId(String billingAccountId) {
            $.billingAccountId = billingAccountId;
            return this;
        }

        public Builder sinkId(String sinkId) {
            $.sinkId = sinkId;
            return this;
        }

        public GetBillingAccountSinkPlainArgs build() {
            $.billingAccountId = Objects.requireNonNull($.billingAccountId, "expected parameter 'billingAccountId' to be non-null");
            $.sinkId = Objects.requireNonNull($.sinkId, "expected parameter 'sinkId' to be non-null");
            return $;
        }
    }

}
