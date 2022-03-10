// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The EC2 launch template that contains configuration settings and game server code to be deployed to all instances in the game server group.
 * 
 */
public final class GameServerGroupLaunchTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerGroupLaunchTemplateArgs Empty = new GameServerGroupLaunchTemplateArgs();

    @InputImport(name="launchTemplateId")
      private final @Nullable Input<String> launchTemplateId;

    public Input<String> getLaunchTemplateId() {
        return this.launchTemplateId == null ? Input.empty() : this.launchTemplateId;
    }

    @InputImport(name="launchTemplateName")
      private final @Nullable Input<String> launchTemplateName;

    public Input<String> getLaunchTemplateName() {
        return this.launchTemplateName == null ? Input.empty() : this.launchTemplateName;
    }

    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public GameServerGroupLaunchTemplateArgs(
        @Nullable Input<String> launchTemplateId,
        @Nullable Input<String> launchTemplateName,
        @Nullable Input<String> version) {
        this.launchTemplateId = launchTemplateId;
        this.launchTemplateName = launchTemplateName;
        this.version = version;
    }

    private GameServerGroupLaunchTemplateArgs() {
        this.launchTemplateId = Input.empty();
        this.launchTemplateName = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerGroupLaunchTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> launchTemplateId;
        private @Nullable Input<String> launchTemplateName;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerGroupLaunchTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchTemplateId = defaults.launchTemplateId;
    	      this.launchTemplateName = defaults.launchTemplateName;
    	      this.version = defaults.version;
        }

        public Builder launchTemplateId(@Nullable Input<String> launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        public Builder launchTemplateId(@Nullable String launchTemplateId) {
            this.launchTemplateId = Input.ofNullable(launchTemplateId);
            return this;
        }

        public Builder launchTemplateName(@Nullable Input<String> launchTemplateName) {
            this.launchTemplateName = launchTemplateName;
            return this;
        }

        public Builder launchTemplateName(@Nullable String launchTemplateName) {
            this.launchTemplateName = Input.ofNullable(launchTemplateName);
            return this;
        }

        public Builder version(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public GameServerGroupLaunchTemplateArgs build() {
            return new GameServerGroupLaunchTemplateArgs(launchTemplateId, launchTemplateName, version);
        }
    }
}
