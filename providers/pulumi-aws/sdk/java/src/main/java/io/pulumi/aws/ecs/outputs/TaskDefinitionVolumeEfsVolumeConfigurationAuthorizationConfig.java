// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig {
    /**
     * Access point ID to use. If an access point is specified, the root directory value will be relative to the directory set for the access point. If specified, transit encryption must be enabled in the EFSVolumeConfiguration.
     * 
     */
    private final @Nullable String accessPointId;
    /**
     * Whether or not to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon EFS file system. If enabled, transit encryption must be enabled in the EFSVolumeConfiguration. Valid values: `ENABLED`, `DISABLED`. If this parameter is omitted, the default value of `DISABLED` is used.
     * 
     */
    private final @Nullable String iam;

    @OutputCustomType.Constructor
    private TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig(
        @OutputCustomType.Parameter("accessPointId") @Nullable String accessPointId,
        @OutputCustomType.Parameter("iam") @Nullable String iam) {
        this.accessPointId = accessPointId;
        this.iam = iam;
    }

    /**
     * Access point ID to use. If an access point is specified, the root directory value will be relative to the directory set for the access point. If specified, transit encryption must be enabled in the EFSVolumeConfiguration.
     * 
    */
    public Optional<String> getAccessPointId() {
        return Optional.ofNullable(this.accessPointId);
    }
    /**
     * Whether or not to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon EFS file system. If enabled, transit encryption must be enabled in the EFSVolumeConfiguration. Valid values: `ENABLED`, `DISABLED`. If this parameter is omitted, the default value of `DISABLED` is used.
     * 
    */
    public Optional<String> getIam() {
        return Optional.ofNullable(this.iam);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessPointId;
        private @Nullable String iam;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPointId = defaults.accessPointId;
    	      this.iam = defaults.iam;
        }

        public Builder accessPointId(@Nullable String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }

        public Builder iam(@Nullable String iam) {
            this.iam = iam;
            return this;
        }
        public TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig build() {
            return new TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfig(accessPointId, iam);
        }
    }
}
