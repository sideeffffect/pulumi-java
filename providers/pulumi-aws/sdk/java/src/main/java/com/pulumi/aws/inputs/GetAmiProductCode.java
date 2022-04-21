// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAmiProductCode extends com.pulumi.resources.InvokeArgs {

    public static final GetAmiProductCode Empty = new GetAmiProductCode();

    @Import(name="productCodeId", required=true)
    private String productCodeId;

    public String productCodeId() {
        return this.productCodeId;
    }

    @Import(name="productCodeType", required=true)
    private String productCodeType;

    public String productCodeType() {
        return this.productCodeType;
    }

    private GetAmiProductCode() {}

    private GetAmiProductCode(GetAmiProductCode $) {
        this.productCodeId = $.productCodeId;
        this.productCodeType = $.productCodeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAmiProductCode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAmiProductCode $;

        public Builder() {
            $ = new GetAmiProductCode();
        }

        public Builder(GetAmiProductCode defaults) {
            $ = new GetAmiProductCode(Objects.requireNonNull(defaults));
        }

        public Builder productCodeId(String productCodeId) {
            $.productCodeId = productCodeId;
            return this;
        }

        public Builder productCodeType(String productCodeType) {
            $.productCodeType = productCodeType;
            return this;
        }

        public GetAmiProductCode build() {
            $.productCodeId = Objects.requireNonNull($.productCodeId, "expected parameter 'productCodeId' to be non-null");
            $.productCodeType = Objects.requireNonNull($.productCodeType, "expected parameter 'productCodeType' to be non-null");
            return $;
        }
    }

}
