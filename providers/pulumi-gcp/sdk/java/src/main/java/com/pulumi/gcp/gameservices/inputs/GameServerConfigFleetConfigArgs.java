// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gameservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GameServerConfigFleetConfigArgs extends ResourceArgs {

    public static final GameServerConfigFleetConfigArgs Empty = new GameServerConfigFleetConfigArgs();

    /**
     * The fleet spec, which is sent to Agones to configure fleet.
     * The spec can be passed as inline json but it is recommended to use a file reference
     * instead. File references can contain the json or yaml format of the fleet spec. Eg:
     * * fleet_spec = jsonencode(yamldecode(file(&#34;fleet_configs.yaml&#34;)))
     * * fleet_spec = file(&#34;fleet_configs.json&#34;)
     *   The format of the spec can be found :
     *   `https://agones.dev/site/docs/reference/fleet/`.
     * 
     */
    @Import(name="fleetSpec", required=true)
    private Output<String> fleetSpec;

    /**
     * @return The fleet spec, which is sent to Agones to configure fleet.
     * The spec can be passed as inline json but it is recommended to use a file reference
     * instead. File references can contain the json or yaml format of the fleet spec. Eg:
     * * fleet_spec = jsonencode(yamldecode(file(&#34;fleet_configs.yaml&#34;)))
     * * fleet_spec = file(&#34;fleet_configs.json&#34;)
     *   The format of the spec can be found :
     *   `https://agones.dev/site/docs/reference/fleet/`.
     * 
     */
    public Output<String> fleetSpec() {
        return this.fleetSpec;
    }

    /**
     * The name of the ScalingConfig
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the ScalingConfig
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GameServerConfigFleetConfigArgs() {}

    private GameServerConfigFleetConfigArgs(GameServerConfigFleetConfigArgs $) {
        this.fleetSpec = $.fleetSpec;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GameServerConfigFleetConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GameServerConfigFleetConfigArgs $;

        public Builder() {
            $ = new GameServerConfigFleetConfigArgs();
        }

        public Builder(GameServerConfigFleetConfigArgs defaults) {
            $ = new GameServerConfigFleetConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fleetSpec The fleet spec, which is sent to Agones to configure fleet.
         * The spec can be passed as inline json but it is recommended to use a file reference
         * instead. File references can contain the json or yaml format of the fleet spec. Eg:
         * * fleet_spec = jsonencode(yamldecode(file(&#34;fleet_configs.yaml&#34;)))
         * * fleet_spec = file(&#34;fleet_configs.json&#34;)
         *   The format of the spec can be found :
         *   `https://agones.dev/site/docs/reference/fleet/`.
         * 
         * @return builder
         * 
         */
        public Builder fleetSpec(Output<String> fleetSpec) {
            $.fleetSpec = fleetSpec;
            return this;
        }

        /**
         * @param fleetSpec The fleet spec, which is sent to Agones to configure fleet.
         * The spec can be passed as inline json but it is recommended to use a file reference
         * instead. File references can contain the json or yaml format of the fleet spec. Eg:
         * * fleet_spec = jsonencode(yamldecode(file(&#34;fleet_configs.yaml&#34;)))
         * * fleet_spec = file(&#34;fleet_configs.json&#34;)
         *   The format of the spec can be found :
         *   `https://agones.dev/site/docs/reference/fleet/`.
         * 
         * @return builder
         * 
         */
        public Builder fleetSpec(String fleetSpec) {
            return fleetSpec(Output.of(fleetSpec));
        }

        /**
         * @param name The name of the ScalingConfig
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the ScalingConfig
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GameServerConfigFleetConfigArgs build() {
            $.fleetSpec = Objects.requireNonNull($.fleetSpec, "expected parameter 'fleetSpec' to be non-null");
            return $;
        }
    }

}
