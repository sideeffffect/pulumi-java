// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.azurenative.security.inputs.JitNetworkAccessRequestVirtualMachineArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JitNetworkAccessRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final JitNetworkAccessRequestArgs Empty = new JitNetworkAccessRequestArgs();

    /**
     * The justification for making the initiate request
     * 
     */
    @Import(name="justification")
    private @Nullable Output<String> justification;

    public Optional<Output<String>> justification() {
        return Optional.ofNullable(this.justification);
    }

    /**
     * The identity of the person who made the request
     * 
     */
    @Import(name="requestor", required=true)
    private Output<String> requestor;

    public Output<String> requestor() {
        return this.requestor;
    }

    /**
     * The start time of the request in UTC
     * 
     */
    @Import(name="startTimeUtc", required=true)
    private Output<String> startTimeUtc;

    public Output<String> startTimeUtc() {
        return this.startTimeUtc;
    }

    @Import(name="virtualMachines", required=true)
    private Output<List<JitNetworkAccessRequestVirtualMachineArgs>> virtualMachines;

    public Output<List<JitNetworkAccessRequestVirtualMachineArgs>> virtualMachines() {
        return this.virtualMachines;
    }

    private JitNetworkAccessRequestArgs() {}

    private JitNetworkAccessRequestArgs(JitNetworkAccessRequestArgs $) {
        this.justification = $.justification;
        this.requestor = $.requestor;
        this.startTimeUtc = $.startTimeUtc;
        this.virtualMachines = $.virtualMachines;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JitNetworkAccessRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JitNetworkAccessRequestArgs $;

        public Builder() {
            $ = new JitNetworkAccessRequestArgs();
        }

        public Builder(JitNetworkAccessRequestArgs defaults) {
            $ = new JitNetworkAccessRequestArgs(Objects.requireNonNull(defaults));
        }

        public Builder justification(@Nullable Output<String> justification) {
            $.justification = justification;
            return this;
        }

        public Builder justification(String justification) {
            return justification(Output.of(justification));
        }

        public Builder requestor(Output<String> requestor) {
            $.requestor = requestor;
            return this;
        }

        public Builder requestor(String requestor) {
            return requestor(Output.of(requestor));
        }

        public Builder startTimeUtc(Output<String> startTimeUtc) {
            $.startTimeUtc = startTimeUtc;
            return this;
        }

        public Builder startTimeUtc(String startTimeUtc) {
            return startTimeUtc(Output.of(startTimeUtc));
        }

        public Builder virtualMachines(Output<List<JitNetworkAccessRequestVirtualMachineArgs>> virtualMachines) {
            $.virtualMachines = virtualMachines;
            return this;
        }

        public Builder virtualMachines(List<JitNetworkAccessRequestVirtualMachineArgs> virtualMachines) {
            return virtualMachines(Output.of(virtualMachines));
        }

        public Builder virtualMachines(JitNetworkAccessRequestVirtualMachineArgs... virtualMachines) {
            return virtualMachines(List.of(virtualMachines));
        }

        public JitNetworkAccessRequestArgs build() {
            $.requestor = Objects.requireNonNull($.requestor, "expected parameter 'requestor' to be non-null");
            $.startTimeUtc = Objects.requireNonNull($.startTimeUtc, "expected parameter 'startTimeUtc' to be non-null");
            $.virtualMachines = Objects.requireNonNull($.virtualMachines, "expected parameter 'virtualMachines' to be non-null");
            return $;
        }
    }

}
