// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.FrontDoorHealthProbeMethod;
import com.pulumi.azurenative.network.enums.FrontDoorProtocol;
import com.pulumi.azurenative.network.enums.HealthProbeEnabled;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Load balancing settings for a backend pool
 * 
 */
public final class HealthProbeSettingsModelArgs extends com.pulumi.resources.ResourceArgs {

    public static final HealthProbeSettingsModelArgs Empty = new HealthProbeSettingsModelArgs();

    /**
     * Whether to enable health probes to be made against backends defined under backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend pool.
     * 
     */
    @Import(name="enabledState")
    private @Nullable Output<Either<String,HealthProbeEnabled>> enabledState;

    public Optional<Output<Either<String,HealthProbeEnabled>>> enabledState() {
        return Optional.ofNullable(this.enabledState);
    }

    /**
     * Configures which HTTP method to use to probe the backends defined under backendPools.
     * 
     */
    @Import(name="healthProbeMethod")
    private @Nullable Output<Either<String,FrontDoorHealthProbeMethod>> healthProbeMethod;

    public Optional<Output<Either<String,FrontDoorHealthProbeMethod>>> healthProbeMethod() {
        return Optional.ofNullable(this.healthProbeMethod);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The number of seconds between health probes.
     * 
     */
    @Import(name="intervalInSeconds")
    private @Nullable Output<Integer> intervalInSeconds;

    public Optional<Output<Integer>> intervalInSeconds() {
        return Optional.ofNullable(this.intervalInSeconds);
    }

    /**
     * Resource name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The path to use for the health probe. Default is /
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Protocol scheme to use for this probe
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<Either<String,FrontDoorProtocol>> protocol;

    public Optional<Output<Either<String,FrontDoorProtocol>>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    private HealthProbeSettingsModelArgs() {}

    private HealthProbeSettingsModelArgs(HealthProbeSettingsModelArgs $) {
        this.enabledState = $.enabledState;
        this.healthProbeMethod = $.healthProbeMethod;
        this.id = $.id;
        this.intervalInSeconds = $.intervalInSeconds;
        this.name = $.name;
        this.path = $.path;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HealthProbeSettingsModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HealthProbeSettingsModelArgs $;

        public Builder() {
            $ = new HealthProbeSettingsModelArgs();
        }

        public Builder(HealthProbeSettingsModelArgs defaults) {
            $ = new HealthProbeSettingsModelArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabledState(@Nullable Output<Either<String,HealthProbeEnabled>> enabledState) {
            $.enabledState = enabledState;
            return this;
        }

        public Builder enabledState(Either<String,HealthProbeEnabled> enabledState) {
            return enabledState(Output.of(enabledState));
        }

        public Builder healthProbeMethod(@Nullable Output<Either<String,FrontDoorHealthProbeMethod>> healthProbeMethod) {
            $.healthProbeMethod = healthProbeMethod;
            return this;
        }

        public Builder healthProbeMethod(Either<String,FrontDoorHealthProbeMethod> healthProbeMethod) {
            return healthProbeMethod(Output.of(healthProbeMethod));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder intervalInSeconds(@Nullable Output<Integer> intervalInSeconds) {
            $.intervalInSeconds = intervalInSeconds;
            return this;
        }

        public Builder intervalInSeconds(Integer intervalInSeconds) {
            return intervalInSeconds(Output.of(intervalInSeconds));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder protocol(@Nullable Output<Either<String,FrontDoorProtocol>> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(Either<String,FrontDoorProtocol> protocol) {
            return protocol(Output.of(protocol));
        }

        public HealthProbeSettingsModelArgs build() {
            $.healthProbeMethod = Codegen.stringProp("healthProbeMethod").left(FrontDoorHealthProbeMethod.class).output().arg($.healthProbeMethod).def("HEAD").getNullable();
            return $;
        }
    }

}
