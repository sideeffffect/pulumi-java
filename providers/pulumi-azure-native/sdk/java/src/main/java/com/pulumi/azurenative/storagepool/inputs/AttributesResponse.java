// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagepool.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Attributes of a iSCSI target portal group.
 * 
 */
public final class AttributesResponse extends com.pulumi.resources.InvokeArgs {

    public static final AttributesResponse Empty = new AttributesResponse();

    /**
     * Indicates whether or not authentication is enabled on the ACL.
     * 
     */
    @Import(name="authentication", required=true)
    private Boolean authentication;

    public Boolean authentication() {
        return this.authentication;
    }

    /**
     * Indicates whether or not write protect is enabled on the LUNs.
     * 
     */
    @Import(name="prodModeWriteProtect", required=true)
    private Boolean prodModeWriteProtect;

    public Boolean prodModeWriteProtect() {
        return this.prodModeWriteProtect;
    }

    private AttributesResponse() {}

    private AttributesResponse(AttributesResponse $) {
        this.authentication = $.authentication;
        this.prodModeWriteProtect = $.prodModeWriteProtect;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttributesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttributesResponse $;

        public Builder() {
            $ = new AttributesResponse();
        }

        public Builder(AttributesResponse defaults) {
            $ = new AttributesResponse(Objects.requireNonNull(defaults));
        }

        public Builder authentication(Boolean authentication) {
            $.authentication = authentication;
            return this;
        }

        public Builder prodModeWriteProtect(Boolean prodModeWriteProtect) {
            $.prodModeWriteProtect = prodModeWriteProtect;
            return this;
        }

        public AttributesResponse build() {
            $.authentication = Objects.requireNonNull($.authentication, "expected parameter 'authentication' to be non-null");
            $.prodModeWriteProtect = Objects.requireNonNull($.prodModeWriteProtect, "expected parameter 'prodModeWriteProtect' to be non-null");
            return $;
        }
    }

}
