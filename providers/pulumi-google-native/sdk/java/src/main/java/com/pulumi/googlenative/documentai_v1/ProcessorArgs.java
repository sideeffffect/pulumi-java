// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.documentai_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProcessorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProcessorArgs Empty = new ProcessorArgs();

    /**
     * The time the processor was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The default processor version.
     * 
     */
    @Import(name="defaultProcessorVersion")
    private @Nullable Output<String> defaultProcessorVersion;

    public Optional<Output<String>> defaultProcessorVersion() {
        return Optional.ofNullable(this.defaultProcessorVersion);
    }

    /**
     * The display name of the processor.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The KMS key used for encryption/decryption in CMEK scenarios. See https://cloud.google.com/security-key-management.
     * 
     */
    @Import(name="kmsKeyName")
    private @Nullable Output<String> kmsKeyName;

    public Optional<Output<String>> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The processor type, e.g., INVOICE_PARSING, W2_PARSING, etc.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ProcessorArgs() {}

    private ProcessorArgs(ProcessorArgs $) {
        this.createTime = $.createTime;
        this.defaultProcessorVersion = $.defaultProcessorVersion;
        this.displayName = $.displayName;
        this.kmsKeyName = $.kmsKeyName;
        this.location = $.location;
        this.project = $.project;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProcessorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProcessorArgs $;

        public Builder() {
            $ = new ProcessorArgs();
        }

        public Builder(ProcessorArgs defaults) {
            $ = new ProcessorArgs(Objects.requireNonNull(defaults));
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        public Builder defaultProcessorVersion(@Nullable Output<String> defaultProcessorVersion) {
            $.defaultProcessorVersion = defaultProcessorVersion;
            return this;
        }

        public Builder defaultProcessorVersion(String defaultProcessorVersion) {
            return defaultProcessorVersion(Output.of(defaultProcessorVersion));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ProcessorArgs build() {
            return $;
        }
    }

}
