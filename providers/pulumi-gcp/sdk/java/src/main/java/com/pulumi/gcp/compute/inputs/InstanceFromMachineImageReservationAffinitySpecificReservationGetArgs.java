// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class InstanceFromMachineImageReservationAffinitySpecificReservationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageReservationAffinitySpecificReservationGetArgs Empty = new InstanceFromMachineImageReservationAffinitySpecificReservationGetArgs();

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    @Import(name="values", required=true)
    private Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values;
    }

    private InstanceFromMachineImageReservationAffinitySpecificReservationGetArgs() {}

    private InstanceFromMachineImageReservationAffinitySpecificReservationGetArgs(InstanceFromMachineImageReservationAffinitySpecificReservationGetArgs $) {
        this.key = $.key;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFromMachineImageReservationAffinitySpecificReservationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFromMachineImageReservationAffinitySpecificReservationGetArgs $;

        public Builder() {
            $ = new InstanceFromMachineImageReservationAffinitySpecificReservationGetArgs();
        }

        public Builder(InstanceFromMachineImageReservationAffinitySpecificReservationGetArgs defaults) {
            $ = new InstanceFromMachineImageReservationAffinitySpecificReservationGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public InstanceFromMachineImageReservationAffinitySpecificReservationGetArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
