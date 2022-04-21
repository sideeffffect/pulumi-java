// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gameservices_v1.inputs.FleetConfigArgs;
import com.pulumi.googlenative.gameservices_v1.inputs.ScalingConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigArgs Empty = new ConfigArgs();

    @Import(name="configId", required=true)
    private Output<String> configId;

    public Output<String> configId() {
        return this.configId;
    }

    /**
     * The description of the game server config.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * FleetConfig contains a list of Agones fleet specs. Only one FleetConfig is allowed.
     * 
     */
    @Import(name="fleetConfigs")
    private @Nullable Output<List<FleetConfigArgs>> fleetConfigs;

    public Optional<Output<List<FleetConfigArgs>>> fleetConfigs() {
        return Optional.ofNullable(this.fleetConfigs);
    }

    @Import(name="gameServerDeploymentId", required=true)
    private Output<String> gameServerDeploymentId;

    public Output<String> gameServerDeploymentId() {
        return this.gameServerDeploymentId;
    }

    /**
     * The labels associated with this game server config. Each label is a key-value pair.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource name of the game server config, in the following form: `projects/{project}/locations/{location}/gameServerDeployments/{deployment}/configs/{config}`. For example, `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The autoscaling settings.
     * 
     */
    @Import(name="scalingConfigs")
    private @Nullable Output<List<ScalingConfigArgs>> scalingConfigs;

    public Optional<Output<List<ScalingConfigArgs>>> scalingConfigs() {
        return Optional.ofNullable(this.scalingConfigs);
    }

    private ConfigArgs() {}

    private ConfigArgs(ConfigArgs $) {
        this.configId = $.configId;
        this.description = $.description;
        this.fleetConfigs = $.fleetConfigs;
        this.gameServerDeploymentId = $.gameServerDeploymentId;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.scalingConfigs = $.scalingConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigArgs $;

        public Builder() {
            $ = new ConfigArgs();
        }

        public Builder(ConfigArgs defaults) {
            $ = new ConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Output<String> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(String configId) {
            return configId(Output.of(configId));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder fleetConfigs(@Nullable Output<List<FleetConfigArgs>> fleetConfigs) {
            $.fleetConfigs = fleetConfigs;
            return this;
        }

        public Builder fleetConfigs(List<FleetConfigArgs> fleetConfigs) {
            return fleetConfigs(Output.of(fleetConfigs));
        }

        public Builder fleetConfigs(FleetConfigArgs... fleetConfigs) {
            return fleetConfigs(List.of(fleetConfigs));
        }

        public Builder gameServerDeploymentId(Output<String> gameServerDeploymentId) {
            $.gameServerDeploymentId = gameServerDeploymentId;
            return this;
        }

        public Builder gameServerDeploymentId(String gameServerDeploymentId) {
            return gameServerDeploymentId(Output.of(gameServerDeploymentId));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder scalingConfigs(@Nullable Output<List<ScalingConfigArgs>> scalingConfigs) {
            $.scalingConfigs = scalingConfigs;
            return this;
        }

        public Builder scalingConfigs(List<ScalingConfigArgs> scalingConfigs) {
            return scalingConfigs(Output.of(scalingConfigs));
        }

        public Builder scalingConfigs(ScalingConfigArgs... scalingConfigs) {
            return scalingConfigs(List.of(scalingConfigs));
        }

        public ConfigArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.gameServerDeploymentId = Objects.requireNonNull($.gameServerDeploymentId, "expected parameter 'gameServerDeploymentId' to be non-null");
            return $;
        }
    }

}
