// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gameservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GameServerConfigFleetConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GameServerConfigFleetConfigGetArgs Empty = new GameServerConfigFleetConfigGetArgs();

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

    public Output<String> fleetSpec() {
        return this.fleetSpec;
    }

    /**
     * The name of the ScalingConfig
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GameServerConfigFleetConfigGetArgs() {}

    private GameServerConfigFleetConfigGetArgs(GameServerConfigFleetConfigGetArgs $) {
        this.fleetSpec = $.fleetSpec;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GameServerConfigFleetConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GameServerConfigFleetConfigGetArgs $;

        public Builder() {
            $ = new GameServerConfigFleetConfigGetArgs();
        }

        public Builder(GameServerConfigFleetConfigGetArgs defaults) {
            $ = new GameServerConfigFleetConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder fleetSpec(Output<String> fleetSpec) {
            $.fleetSpec = fleetSpec;
            return this;
        }

        public Builder fleetSpec(String fleetSpec) {
            return fleetSpec(Output.of(fleetSpec));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GameServerConfigFleetConfigGetArgs build() {
            $.fleetSpec = Objects.requireNonNull($.fleetSpec, "expected parameter 'fleetSpec' to be non-null");
            return $;
        }
    }

}
