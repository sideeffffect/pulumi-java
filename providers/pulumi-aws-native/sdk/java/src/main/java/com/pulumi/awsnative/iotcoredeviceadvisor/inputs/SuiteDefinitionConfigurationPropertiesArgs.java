// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotcoredeviceadvisor.inputs;

import com.pulumi.awsnative.iotcoredeviceadvisor.inputs.SuiteDefinitionDeviceUnderTestArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SuiteDefinitionConfigurationPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SuiteDefinitionConfigurationPropertiesArgs Empty = new SuiteDefinitionConfigurationPropertiesArgs();

    @Import(name="devicePermissionRoleArn", required=true)
    private Output<String> devicePermissionRoleArn;

    public Output<String> devicePermissionRoleArn() {
        return this.devicePermissionRoleArn;
    }

    @Import(name="devices")
    private @Nullable Output<List<SuiteDefinitionDeviceUnderTestArgs>> devices;

    public Optional<Output<List<SuiteDefinitionDeviceUnderTestArgs>>> devices() {
        return Optional.ofNullable(this.devices);
    }

    @Import(name="intendedForQualification")
    private @Nullable Output<Boolean> intendedForQualification;

    public Optional<Output<Boolean>> intendedForQualification() {
        return Optional.ofNullable(this.intendedForQualification);
    }

    @Import(name="rootGroup", required=true)
    private Output<String> rootGroup;

    public Output<String> rootGroup() {
        return this.rootGroup;
    }

    @Import(name="suiteDefinitionName")
    private @Nullable Output<String> suiteDefinitionName;

    public Optional<Output<String>> suiteDefinitionName() {
        return Optional.ofNullable(this.suiteDefinitionName);
    }

    private SuiteDefinitionConfigurationPropertiesArgs() {}

    private SuiteDefinitionConfigurationPropertiesArgs(SuiteDefinitionConfigurationPropertiesArgs $) {
        this.devicePermissionRoleArn = $.devicePermissionRoleArn;
        this.devices = $.devices;
        this.intendedForQualification = $.intendedForQualification;
        this.rootGroup = $.rootGroup;
        this.suiteDefinitionName = $.suiteDefinitionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SuiteDefinitionConfigurationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SuiteDefinitionConfigurationPropertiesArgs $;

        public Builder() {
            $ = new SuiteDefinitionConfigurationPropertiesArgs();
        }

        public Builder(SuiteDefinitionConfigurationPropertiesArgs defaults) {
            $ = new SuiteDefinitionConfigurationPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder devicePermissionRoleArn(Output<String> devicePermissionRoleArn) {
            $.devicePermissionRoleArn = devicePermissionRoleArn;
            return this;
        }

        public Builder devicePermissionRoleArn(String devicePermissionRoleArn) {
            return devicePermissionRoleArn(Output.of(devicePermissionRoleArn));
        }

        public Builder devices(@Nullable Output<List<SuiteDefinitionDeviceUnderTestArgs>> devices) {
            $.devices = devices;
            return this;
        }

        public Builder devices(List<SuiteDefinitionDeviceUnderTestArgs> devices) {
            return devices(Output.of(devices));
        }

        public Builder devices(SuiteDefinitionDeviceUnderTestArgs... devices) {
            return devices(List.of(devices));
        }

        public Builder intendedForQualification(@Nullable Output<Boolean> intendedForQualification) {
            $.intendedForQualification = intendedForQualification;
            return this;
        }

        public Builder intendedForQualification(Boolean intendedForQualification) {
            return intendedForQualification(Output.of(intendedForQualification));
        }

        public Builder rootGroup(Output<String> rootGroup) {
            $.rootGroup = rootGroup;
            return this;
        }

        public Builder rootGroup(String rootGroup) {
            return rootGroup(Output.of(rootGroup));
        }

        public Builder suiteDefinitionName(@Nullable Output<String> suiteDefinitionName) {
            $.suiteDefinitionName = suiteDefinitionName;
            return this;
        }

        public Builder suiteDefinitionName(String suiteDefinitionName) {
            return suiteDefinitionName(Output.of(suiteDefinitionName));
        }

        public SuiteDefinitionConfigurationPropertiesArgs build() {
            $.devicePermissionRoleArn = Objects.requireNonNull($.devicePermissionRoleArn, "expected parameter 'devicePermissionRoleArn' to be non-null");
            $.rootGroup = Objects.requireNonNull($.rootGroup, "expected parameter 'rootGroup' to be non-null");
            return $;
        }
    }

}
