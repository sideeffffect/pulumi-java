// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JavaAppLayerCloudwatchConfigurationLogStreamArgs extends com.pulumi.resources.ResourceArgs {

    public static final JavaAppLayerCloudwatchConfigurationLogStreamArgs Empty = new JavaAppLayerCloudwatchConfigurationLogStreamArgs();

    @Import(name="batchCount")
    private @Nullable Output<Integer> batchCount;

    public Optional<Output<Integer>> batchCount() {
        return Optional.ofNullable(this.batchCount);
    }

    @Import(name="batchSize")
    private @Nullable Output<Integer> batchSize;

    public Optional<Output<Integer>> batchSize() {
        return Optional.ofNullable(this.batchSize);
    }

    @Import(name="bufferDuration")
    private @Nullable Output<Integer> bufferDuration;

    public Optional<Output<Integer>> bufferDuration() {
        return Optional.ofNullable(this.bufferDuration);
    }

    @Import(name="datetimeFormat")
    private @Nullable Output<String> datetimeFormat;

    public Optional<Output<String>> datetimeFormat() {
        return Optional.ofNullable(this.datetimeFormat);
    }

    @Import(name="encoding")
    private @Nullable Output<String> encoding;

    public Optional<Output<String>> encoding() {
        return Optional.ofNullable(this.encoding);
    }

    @Import(name="file", required=true)
    private Output<String> file;

    public Output<String> file() {
        return this.file;
    }

    @Import(name="fileFingerprintLines")
    private @Nullable Output<String> fileFingerprintLines;

    public Optional<Output<String>> fileFingerprintLines() {
        return Optional.ofNullable(this.fileFingerprintLines);
    }

    @Import(name="initialPosition")
    private @Nullable Output<String> initialPosition;

    public Optional<Output<String>> initialPosition() {
        return Optional.ofNullable(this.initialPosition);
    }

    @Import(name="logGroupName", required=true)
    private Output<String> logGroupName;

    public Output<String> logGroupName() {
        return this.logGroupName;
    }

    @Import(name="multilineStartPattern")
    private @Nullable Output<String> multilineStartPattern;

    public Optional<Output<String>> multilineStartPattern() {
        return Optional.ofNullable(this.multilineStartPattern);
    }

    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    private JavaAppLayerCloudwatchConfigurationLogStreamArgs() {}

    private JavaAppLayerCloudwatchConfigurationLogStreamArgs(JavaAppLayerCloudwatchConfigurationLogStreamArgs $) {
        this.batchCount = $.batchCount;
        this.batchSize = $.batchSize;
        this.bufferDuration = $.bufferDuration;
        this.datetimeFormat = $.datetimeFormat;
        this.encoding = $.encoding;
        this.file = $.file;
        this.fileFingerprintLines = $.fileFingerprintLines;
        this.initialPosition = $.initialPosition;
        this.logGroupName = $.logGroupName;
        this.multilineStartPattern = $.multilineStartPattern;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JavaAppLayerCloudwatchConfigurationLogStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JavaAppLayerCloudwatchConfigurationLogStreamArgs $;

        public Builder() {
            $ = new JavaAppLayerCloudwatchConfigurationLogStreamArgs();
        }

        public Builder(JavaAppLayerCloudwatchConfigurationLogStreamArgs defaults) {
            $ = new JavaAppLayerCloudwatchConfigurationLogStreamArgs(Objects.requireNonNull(defaults));
        }

        public Builder batchCount(@Nullable Output<Integer> batchCount) {
            $.batchCount = batchCount;
            return this;
        }

        public Builder batchCount(Integer batchCount) {
            return batchCount(Output.of(batchCount));
        }

        public Builder batchSize(@Nullable Output<Integer> batchSize) {
            $.batchSize = batchSize;
            return this;
        }

        public Builder batchSize(Integer batchSize) {
            return batchSize(Output.of(batchSize));
        }

        public Builder bufferDuration(@Nullable Output<Integer> bufferDuration) {
            $.bufferDuration = bufferDuration;
            return this;
        }

        public Builder bufferDuration(Integer bufferDuration) {
            return bufferDuration(Output.of(bufferDuration));
        }

        public Builder datetimeFormat(@Nullable Output<String> datetimeFormat) {
            $.datetimeFormat = datetimeFormat;
            return this;
        }

        public Builder datetimeFormat(String datetimeFormat) {
            return datetimeFormat(Output.of(datetimeFormat));
        }

        public Builder encoding(@Nullable Output<String> encoding) {
            $.encoding = encoding;
            return this;
        }

        public Builder encoding(String encoding) {
            return encoding(Output.of(encoding));
        }

        public Builder file(Output<String> file) {
            $.file = file;
            return this;
        }

        public Builder file(String file) {
            return file(Output.of(file));
        }

        public Builder fileFingerprintLines(@Nullable Output<String> fileFingerprintLines) {
            $.fileFingerprintLines = fileFingerprintLines;
            return this;
        }

        public Builder fileFingerprintLines(String fileFingerprintLines) {
            return fileFingerprintLines(Output.of(fileFingerprintLines));
        }

        public Builder initialPosition(@Nullable Output<String> initialPosition) {
            $.initialPosition = initialPosition;
            return this;
        }

        public Builder initialPosition(String initialPosition) {
            return initialPosition(Output.of(initialPosition));
        }

        public Builder logGroupName(Output<String> logGroupName) {
            $.logGroupName = logGroupName;
            return this;
        }

        public Builder logGroupName(String logGroupName) {
            return logGroupName(Output.of(logGroupName));
        }

        public Builder multilineStartPattern(@Nullable Output<String> multilineStartPattern) {
            $.multilineStartPattern = multilineStartPattern;
            return this;
        }

        public Builder multilineStartPattern(String multilineStartPattern) {
            return multilineStartPattern(Output.of(multilineStartPattern));
        }

        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public JavaAppLayerCloudwatchConfigurationLogStreamArgs build() {
            $.file = Objects.requireNonNull($.file, "expected parameter 'file' to be non-null");
            $.logGroupName = Objects.requireNonNull($.logGroupName, "expected parameter 'logGroupName' to be non-null");
            return $;
        }
    }

}
