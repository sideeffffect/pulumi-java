// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.enums.StorageType;
import com.pulumi.azurenative.web.inputs.FrontEndConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ArcConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ArcConfigurationArgs Empty = new ArcConfigurationArgs();

    @Import(name="artifactStorageAccessMode")
    private @Nullable Output<String> artifactStorageAccessMode;

    public Optional<Output<String>> artifactStorageAccessMode() {
        return Optional.ofNullable(this.artifactStorageAccessMode);
    }

    @Import(name="artifactStorageClassName")
    private @Nullable Output<String> artifactStorageClassName;

    public Optional<Output<String>> artifactStorageClassName() {
        return Optional.ofNullable(this.artifactStorageClassName);
    }

    @Import(name="artifactStorageMountPath")
    private @Nullable Output<String> artifactStorageMountPath;

    public Optional<Output<String>> artifactStorageMountPath() {
        return Optional.ofNullable(this.artifactStorageMountPath);
    }

    @Import(name="artifactStorageNodeName")
    private @Nullable Output<String> artifactStorageNodeName;

    public Optional<Output<String>> artifactStorageNodeName() {
        return Optional.ofNullable(this.artifactStorageNodeName);
    }

    @Import(name="artifactsStorageType")
    private @Nullable Output<StorageType> artifactsStorageType;

    public Optional<Output<StorageType>> artifactsStorageType() {
        return Optional.ofNullable(this.artifactsStorageType);
    }

    @Import(name="frontEndServiceConfiguration")
    private @Nullable Output<FrontEndConfigurationArgs> frontEndServiceConfiguration;

    public Optional<Output<FrontEndConfigurationArgs>> frontEndServiceConfiguration() {
        return Optional.ofNullable(this.frontEndServiceConfiguration);
    }

    @Import(name="kubeConfig")
    private @Nullable Output<String> kubeConfig;

    public Optional<Output<String>> kubeConfig() {
        return Optional.ofNullable(this.kubeConfig);
    }

    private ArcConfigurationArgs() {}

    private ArcConfigurationArgs(ArcConfigurationArgs $) {
        this.artifactStorageAccessMode = $.artifactStorageAccessMode;
        this.artifactStorageClassName = $.artifactStorageClassName;
        this.artifactStorageMountPath = $.artifactStorageMountPath;
        this.artifactStorageNodeName = $.artifactStorageNodeName;
        this.artifactsStorageType = $.artifactsStorageType;
        this.frontEndServiceConfiguration = $.frontEndServiceConfiguration;
        this.kubeConfig = $.kubeConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ArcConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ArcConfigurationArgs $;

        public Builder() {
            $ = new ArcConfigurationArgs();
        }

        public Builder(ArcConfigurationArgs defaults) {
            $ = new ArcConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder artifactStorageAccessMode(@Nullable Output<String> artifactStorageAccessMode) {
            $.artifactStorageAccessMode = artifactStorageAccessMode;
            return this;
        }

        public Builder artifactStorageAccessMode(String artifactStorageAccessMode) {
            return artifactStorageAccessMode(Output.of(artifactStorageAccessMode));
        }

        public Builder artifactStorageClassName(@Nullable Output<String> artifactStorageClassName) {
            $.artifactStorageClassName = artifactStorageClassName;
            return this;
        }

        public Builder artifactStorageClassName(String artifactStorageClassName) {
            return artifactStorageClassName(Output.of(artifactStorageClassName));
        }

        public Builder artifactStorageMountPath(@Nullable Output<String> artifactStorageMountPath) {
            $.artifactStorageMountPath = artifactStorageMountPath;
            return this;
        }

        public Builder artifactStorageMountPath(String artifactStorageMountPath) {
            return artifactStorageMountPath(Output.of(artifactStorageMountPath));
        }

        public Builder artifactStorageNodeName(@Nullable Output<String> artifactStorageNodeName) {
            $.artifactStorageNodeName = artifactStorageNodeName;
            return this;
        }

        public Builder artifactStorageNodeName(String artifactStorageNodeName) {
            return artifactStorageNodeName(Output.of(artifactStorageNodeName));
        }

        public Builder artifactsStorageType(@Nullable Output<StorageType> artifactsStorageType) {
            $.artifactsStorageType = artifactsStorageType;
            return this;
        }

        public Builder artifactsStorageType(StorageType artifactsStorageType) {
            return artifactsStorageType(Output.of(artifactsStorageType));
        }

        public Builder frontEndServiceConfiguration(@Nullable Output<FrontEndConfigurationArgs> frontEndServiceConfiguration) {
            $.frontEndServiceConfiguration = frontEndServiceConfiguration;
            return this;
        }

        public Builder frontEndServiceConfiguration(FrontEndConfigurationArgs frontEndServiceConfiguration) {
            return frontEndServiceConfiguration(Output.of(frontEndServiceConfiguration));
        }

        public Builder kubeConfig(@Nullable Output<String> kubeConfig) {
            $.kubeConfig = kubeConfig;
            return this;
        }

        public Builder kubeConfig(String kubeConfig) {
            return kubeConfig(Output.of(kubeConfig));
        }

        public ArcConfigurationArgs build() {
            return $;
        }
    }

}
