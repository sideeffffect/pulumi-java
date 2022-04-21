// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datafusion_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Identifies Data Fusion accelerators for an instance.
 * 
 */
public final class AcceleratorResponse extends com.pulumi.resources.InvokeArgs {

    public static final AcceleratorResponse Empty = new AcceleratorResponse();

    /**
     * The type of an accelator for a CDF instance.
     * 
     */
    @Import(name="acceleratorType", required=true)
    private String acceleratorType;

    public String acceleratorType() {
        return this.acceleratorType;
    }

    /**
     * The state of the accelerator
     * 
     */
    @Import(name="state", required=true)
    private String state;

    public String state() {
        return this.state;
    }

    private AcceleratorResponse() {}

    private AcceleratorResponse(AcceleratorResponse $) {
        this.acceleratorType = $.acceleratorType;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AcceleratorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AcceleratorResponse $;

        public Builder() {
            $ = new AcceleratorResponse();
        }

        public Builder(AcceleratorResponse defaults) {
            $ = new AcceleratorResponse(Objects.requireNonNull(defaults));
        }

        public Builder acceleratorType(String acceleratorType) {
            $.acceleratorType = acceleratorType;
            return this;
        }

        public Builder state(String state) {
            $.state = state;
            return this;
        }

        public AcceleratorResponse build() {
            $.acceleratorType = Objects.requireNonNull($.acceleratorType, "expected parameter 'acceleratorType' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            return $;
        }
    }

}
