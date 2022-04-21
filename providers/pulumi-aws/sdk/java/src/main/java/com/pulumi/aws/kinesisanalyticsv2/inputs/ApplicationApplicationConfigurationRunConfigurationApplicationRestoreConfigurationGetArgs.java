// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfigurationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfigurationGetArgs Empty = new ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfigurationGetArgs();

    /**
     * Specifies how the application should be restored. Valid values: `RESTORE_FROM_CUSTOM_SNAPSHOT`, `RESTORE_FROM_LATEST_SNAPSHOT`, `SKIP_RESTORE_FROM_SNAPSHOT`.
     * 
     */
    @Import(name="applicationRestoreType")
    private @Nullable Output<String> applicationRestoreType;

    public Optional<Output<String>> applicationRestoreType() {
        return Optional.ofNullable(this.applicationRestoreType);
    }

    /**
     * The identifier of an existing snapshot of application state to use to restart an application. The application uses this value if `RESTORE_FROM_CUSTOM_SNAPSHOT` is specified for `application_restore_type`.
     * 
     */
    @Import(name="snapshotName")
    private @Nullable Output<String> snapshotName;

    public Optional<Output<String>> snapshotName() {
        return Optional.ofNullable(this.snapshotName);
    }

    private ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfigurationGetArgs() {}

    private ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfigurationGetArgs(ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfigurationGetArgs $) {
        this.applicationRestoreType = $.applicationRestoreType;
        this.snapshotName = $.snapshotName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfigurationGetArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfigurationGetArgs();
        }

        public Builder(ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfigurationGetArgs defaults) {
            $ = new ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfigurationGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder applicationRestoreType(@Nullable Output<String> applicationRestoreType) {
            $.applicationRestoreType = applicationRestoreType;
            return this;
        }

        public Builder applicationRestoreType(String applicationRestoreType) {
            return applicationRestoreType(Output.of(applicationRestoreType));
        }

        public Builder snapshotName(@Nullable Output<String> snapshotName) {
            $.snapshotName = snapshotName;
            return this;
        }

        public Builder snapshotName(String snapshotName) {
            return snapshotName(Output.of(snapshotName));
        }

        public ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfigurationGetArgs build() {
            return $;
        }
    }

}
