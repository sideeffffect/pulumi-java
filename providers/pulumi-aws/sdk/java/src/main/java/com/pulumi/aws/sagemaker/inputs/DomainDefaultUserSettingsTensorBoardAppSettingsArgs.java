// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainDefaultUserSettingsTensorBoardAppSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainDefaultUserSettingsTensorBoardAppSettingsArgs Empty = new DomainDefaultUserSettingsTensorBoardAppSettingsArgs();

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    @Import(name="defaultResourceSpec")
    private @Nullable Output<DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs> defaultResourceSpec;

    public Optional<Output<DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs>> defaultResourceSpec() {
        return Optional.ofNullable(this.defaultResourceSpec);
    }

    private DomainDefaultUserSettingsTensorBoardAppSettingsArgs() {}

    private DomainDefaultUserSettingsTensorBoardAppSettingsArgs(DomainDefaultUserSettingsTensorBoardAppSettingsArgs $) {
        this.defaultResourceSpec = $.defaultResourceSpec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainDefaultUserSettingsTensorBoardAppSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainDefaultUserSettingsTensorBoardAppSettingsArgs $;

        public Builder() {
            $ = new DomainDefaultUserSettingsTensorBoardAppSettingsArgs();
        }

        public Builder(DomainDefaultUserSettingsTensorBoardAppSettingsArgs defaults) {
            $ = new DomainDefaultUserSettingsTensorBoardAppSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder defaultResourceSpec(@Nullable Output<DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs> defaultResourceSpec) {
            $.defaultResourceSpec = defaultResourceSpec;
            return this;
        }

        public Builder defaultResourceSpec(DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs defaultResourceSpec) {
            return defaultResourceSpec(Output.of(defaultResourceSpec));
        }

        public DomainDefaultUserSettingsTensorBoardAppSettingsArgs build() {
            return $;
        }
    }

}
