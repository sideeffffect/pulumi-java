// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakestore.inputs;

import com.pulumi.azurenative.datalakestore.enums.EncryptionIdentityType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The encryption identity properties.
 * 
 */
public final class EncryptionIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final EncryptionIdentityArgs Empty = new EncryptionIdentityArgs();

    /**
     * The type of encryption being used. Currently the only supported type is &#39;SystemAssigned&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<EncryptionIdentityType> type;

    public Output<EncryptionIdentityType> type() {
        return this.type;
    }

    private EncryptionIdentityArgs() {}

    private EncryptionIdentityArgs(EncryptionIdentityArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionIdentityArgs $;

        public Builder() {
            $ = new EncryptionIdentityArgs();
        }

        public Builder(EncryptionIdentityArgs defaults) {
            $ = new EncryptionIdentityArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(Output<EncryptionIdentityType> type) {
            $.type = type;
            return this;
        }

        public Builder type(EncryptionIdentityType type) {
            return type(Output.of(type));
        }

        public EncryptionIdentityArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
