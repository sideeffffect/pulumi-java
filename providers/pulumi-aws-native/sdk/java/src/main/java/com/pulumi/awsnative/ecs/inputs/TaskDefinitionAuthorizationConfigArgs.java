// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.inputs;

import com.pulumi.awsnative.ecs.enums.TaskDefinitionAuthorizationConfigIAM;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskDefinitionAuthorizationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionAuthorizationConfigArgs Empty = new TaskDefinitionAuthorizationConfigArgs();

    @Import(name="accessPointId")
    private @Nullable Output<String> accessPointId;

    public Optional<Output<String>> accessPointId() {
        return Optional.ofNullable(this.accessPointId);
    }

    @Import(name="iAM")
    private @Nullable Output<TaskDefinitionAuthorizationConfigIAM> iAM;

    public Optional<Output<TaskDefinitionAuthorizationConfigIAM>> iAM() {
        return Optional.ofNullable(this.iAM);
    }

    private TaskDefinitionAuthorizationConfigArgs() {}

    private TaskDefinitionAuthorizationConfigArgs(TaskDefinitionAuthorizationConfigArgs $) {
        this.accessPointId = $.accessPointId;
        this.iAM = $.iAM;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskDefinitionAuthorizationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskDefinitionAuthorizationConfigArgs $;

        public Builder() {
            $ = new TaskDefinitionAuthorizationConfigArgs();
        }

        public Builder(TaskDefinitionAuthorizationConfigArgs defaults) {
            $ = new TaskDefinitionAuthorizationConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessPointId(@Nullable Output<String> accessPointId) {
            $.accessPointId = accessPointId;
            return this;
        }

        public Builder accessPointId(String accessPointId) {
            return accessPointId(Output.of(accessPointId));
        }

        public Builder iAM(@Nullable Output<TaskDefinitionAuthorizationConfigIAM> iAM) {
            $.iAM = iAM;
            return this;
        }

        public Builder iAM(TaskDefinitionAuthorizationConfigIAM iAM) {
            return iAM(Output.of(iAM));
        }

        public TaskDefinitionAuthorizationConfigArgs build() {
            return $;
        }
    }

}
