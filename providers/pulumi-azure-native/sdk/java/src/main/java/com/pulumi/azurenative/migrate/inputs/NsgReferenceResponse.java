// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Defines reference to NSG.
 * 
 */
public final class NsgReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final NsgReferenceResponse Empty = new NsgReferenceResponse();

    /**
     * Gets the ARM resource ID of the tracked resource being referenced.
     * 
     */
    @Import(name="sourceArmResourceId", required=true)
    private String sourceArmResourceId;

    public String sourceArmResourceId() {
        return this.sourceArmResourceId;
    }

    private NsgReferenceResponse() {}

    private NsgReferenceResponse(NsgReferenceResponse $) {
        this.sourceArmResourceId = $.sourceArmResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NsgReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NsgReferenceResponse $;

        public Builder() {
            $ = new NsgReferenceResponse();
        }

        public Builder(NsgReferenceResponse defaults) {
            $ = new NsgReferenceResponse(Objects.requireNonNull(defaults));
        }

        public Builder sourceArmResourceId(String sourceArmResourceId) {
            $.sourceArmResourceId = sourceArmResourceId;
            return this;
        }

        public NsgReferenceResponse build() {
            $.sourceArmResourceId = Objects.requireNonNull($.sourceArmResourceId, "expected parameter 'sourceArmResourceId' to be non-null");
            return $;
        }
    }

}
