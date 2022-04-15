// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorArgs Empty = new GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorArgs();

    /**
     * List of realms to match against.
     * 
     */
    @Import(name="realms")
      private final @Nullable Output<List<String>> realms;

    public Output<List<String>> realms() {
        return this.realms == null ? Codegen.empty() : this.realms;
    }

    public GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorArgs(@Nullable Output<List<String>> realms) {
        this.realms = realms;
    }

    private GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorArgs() {
        this.realms = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> realms;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.realms = defaults.realms;
        }

        public Builder realms(@Nullable Output<List<String>> realms) {
            this.realms = realms;
            return this;
        }
        public Builder realms(@Nullable List<String> realms) {
            this.realms = Codegen.ofNullable(realms);
            return this;
        }
        public Builder realms(String... realms) {
            return realms(List.of(realms));
        }        public GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorArgs build() {
            return new GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelectorArgs(realms);
        }
    }
}
