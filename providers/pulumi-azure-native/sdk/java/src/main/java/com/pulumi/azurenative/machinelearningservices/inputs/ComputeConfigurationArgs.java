// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for compute binding.
 * 
 */
public final class ComputeConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ComputeConfigurationArgs Empty = new ComputeConfigurationArgs();

    /**
     * Number of instances or nodes.
     * 
     */
    @Import(name="instanceCount")
    private @Nullable Output<Integer> instanceCount;

    public Optional<Output<Integer>> instanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }

    /**
     * SKU type to run on.
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * Set to true for jobs running on local compute.
     * 
     */
    @Import(name="isLocal")
    private @Nullable Output<Boolean> isLocal;

    public Optional<Output<Boolean>> isLocal() {
        return Optional.ofNullable(this.isLocal);
    }

    /**
     * Location for virtual cluster run.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Additional properties.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * ARM resource ID of the compute resource.
     * 
     */
    @Import(name="target")
    private @Nullable Output<String> target;

    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    private ComputeConfigurationArgs() {}

    private ComputeConfigurationArgs(ComputeConfigurationArgs $) {
        this.instanceCount = $.instanceCount;
        this.instanceType = $.instanceType;
        this.isLocal = $.isLocal;
        this.location = $.location;
        this.properties = $.properties;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComputeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComputeConfigurationArgs $;

        public Builder() {
            $ = new ComputeConfigurationArgs();
        }

        public Builder(ComputeConfigurationArgs defaults) {
            $ = new ComputeConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceCount(@Nullable Output<Integer> instanceCount) {
            $.instanceCount = instanceCount;
            return this;
        }

        public Builder instanceCount(Integer instanceCount) {
            return instanceCount(Output.of(instanceCount));
        }

        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        public Builder isLocal(@Nullable Output<Boolean> isLocal) {
            $.isLocal = isLocal;
            return this;
        }

        public Builder isLocal(Boolean isLocal) {
            return isLocal(Output.of(isLocal));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        public Builder target(String target) {
            return target(Output.of(target));
        }

        public ComputeConfigurationArgs build() {
            return $;
        }
    }

}
