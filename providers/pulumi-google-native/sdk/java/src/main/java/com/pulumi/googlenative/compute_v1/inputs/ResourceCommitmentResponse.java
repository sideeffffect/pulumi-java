// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Commitment for a particular resource (a Commitment is composed of one or more of these).
 * 
 */
public final class ResourceCommitmentResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourceCommitmentResponse Empty = new ResourceCommitmentResponse();

    /**
     * Name of the accelerator type resource. Applicable only when the type is ACCELERATOR.
     * 
     */
    @Import(name="acceleratorType", required=true)
    private String acceleratorType;

    public String acceleratorType() {
        return this.acceleratorType;
    }

    /**
     * The amount of the resource purchased (in a type-dependent unit, such as bytes). For vCPUs, this can just be an integer. For memory, this must be provided in MB. Memory must be a multiple of 256 MB, with up to 6.5GB of memory per every vCPU.
     * 
     */
    @Import(name="amount", required=true)
    private String amount;

    public String amount() {
        return this.amount;
    }

    /**
     * Type of resource for which this commitment applies. Possible values are VCPU and MEMORY
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private ResourceCommitmentResponse() {}

    private ResourceCommitmentResponse(ResourceCommitmentResponse $) {
        this.acceleratorType = $.acceleratorType;
        this.amount = $.amount;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceCommitmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceCommitmentResponse $;

        public Builder() {
            $ = new ResourceCommitmentResponse();
        }

        public Builder(ResourceCommitmentResponse defaults) {
            $ = new ResourceCommitmentResponse(Objects.requireNonNull(defaults));
        }

        public Builder acceleratorType(String acceleratorType) {
            $.acceleratorType = acceleratorType;
            return this;
        }

        public Builder amount(String amount) {
            $.amount = amount;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ResourceCommitmentResponse build() {
            $.acceleratorType = Objects.requireNonNull($.acceleratorType, "expected parameter 'acceleratorType' to be non-null");
            $.amount = Objects.requireNonNull($.amount, "expected parameter 'amount' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
