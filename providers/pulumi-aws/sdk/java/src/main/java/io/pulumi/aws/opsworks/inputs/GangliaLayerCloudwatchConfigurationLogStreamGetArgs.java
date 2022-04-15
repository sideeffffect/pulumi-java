// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GangliaLayerCloudwatchConfigurationLogStreamGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GangliaLayerCloudwatchConfigurationLogStreamGetArgs Empty = new GangliaLayerCloudwatchConfigurationLogStreamGetArgs();

    @Import(name="batchCount")
      private final @Nullable Output<Integer> batchCount;

    public Output<Integer> batchCount() {
        return this.batchCount == null ? Codegen.empty() : this.batchCount;
    }

    @Import(name="batchSize")
      private final @Nullable Output<Integer> batchSize;

    public Output<Integer> batchSize() {
        return this.batchSize == null ? Codegen.empty() : this.batchSize;
    }

    @Import(name="bufferDuration")
      private final @Nullable Output<Integer> bufferDuration;

    public Output<Integer> bufferDuration() {
        return this.bufferDuration == null ? Codegen.empty() : this.bufferDuration;
    }

    @Import(name="datetimeFormat")
      private final @Nullable Output<String> datetimeFormat;

    public Output<String> datetimeFormat() {
        return this.datetimeFormat == null ? Codegen.empty() : this.datetimeFormat;
    }

    @Import(name="encoding")
      private final @Nullable Output<String> encoding;

    public Output<String> encoding() {
        return this.encoding == null ? Codegen.empty() : this.encoding;
    }

    @Import(name="file", required=true)
      private final Output<String> file;

    public Output<String> file() {
        return this.file;
    }

    @Import(name="fileFingerprintLines")
      private final @Nullable Output<String> fileFingerprintLines;

    public Output<String> fileFingerprintLines() {
        return this.fileFingerprintLines == null ? Codegen.empty() : this.fileFingerprintLines;
    }

    @Import(name="initialPosition")
      private final @Nullable Output<String> initialPosition;

    public Output<String> initialPosition() {
        return this.initialPosition == null ? Codegen.empty() : this.initialPosition;
    }

    @Import(name="logGroupName", required=true)
      private final Output<String> logGroupName;

    public Output<String> logGroupName() {
        return this.logGroupName;
    }

    @Import(name="multilineStartPattern")
      private final @Nullable Output<String> multilineStartPattern;

    public Output<String> multilineStartPattern() {
        return this.multilineStartPattern == null ? Codegen.empty() : this.multilineStartPattern;
    }

    @Import(name="timeZone")
      private final @Nullable Output<String> timeZone;

    public Output<String> timeZone() {
        return this.timeZone == null ? Codegen.empty() : this.timeZone;
    }

    public GangliaLayerCloudwatchConfigurationLogStreamGetArgs(
        @Nullable Output<Integer> batchCount,
        @Nullable Output<Integer> batchSize,
        @Nullable Output<Integer> bufferDuration,
        @Nullable Output<String> datetimeFormat,
        @Nullable Output<String> encoding,
        Output<String> file,
        @Nullable Output<String> fileFingerprintLines,
        @Nullable Output<String> initialPosition,
        Output<String> logGroupName,
        @Nullable Output<String> multilineStartPattern,
        @Nullable Output<String> timeZone) {
        this.batchCount = batchCount;
        this.batchSize = batchSize;
        this.bufferDuration = bufferDuration;
        this.datetimeFormat = datetimeFormat;
        this.encoding = encoding;
        this.file = Objects.requireNonNull(file, "expected parameter 'file' to be non-null");
        this.fileFingerprintLines = fileFingerprintLines;
        this.initialPosition = initialPosition;
        this.logGroupName = Objects.requireNonNull(logGroupName, "expected parameter 'logGroupName' to be non-null");
        this.multilineStartPattern = multilineStartPattern;
        this.timeZone = timeZone;
    }

    private GangliaLayerCloudwatchConfigurationLogStreamGetArgs() {
        this.batchCount = Codegen.empty();
        this.batchSize = Codegen.empty();
        this.bufferDuration = Codegen.empty();
        this.datetimeFormat = Codegen.empty();
        this.encoding = Codegen.empty();
        this.file = Codegen.empty();
        this.fileFingerprintLines = Codegen.empty();
        this.initialPosition = Codegen.empty();
        this.logGroupName = Codegen.empty();
        this.multilineStartPattern = Codegen.empty();
        this.timeZone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GangliaLayerCloudwatchConfigurationLogStreamGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> batchCount;
        private @Nullable Output<Integer> batchSize;
        private @Nullable Output<Integer> bufferDuration;
        private @Nullable Output<String> datetimeFormat;
        private @Nullable Output<String> encoding;
        private Output<String> file;
        private @Nullable Output<String> fileFingerprintLines;
        private @Nullable Output<String> initialPosition;
        private Output<String> logGroupName;
        private @Nullable Output<String> multilineStartPattern;
        private @Nullable Output<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(GangliaLayerCloudwatchConfigurationLogStreamGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchCount = defaults.batchCount;
    	      this.batchSize = defaults.batchSize;
    	      this.bufferDuration = defaults.bufferDuration;
    	      this.datetimeFormat = defaults.datetimeFormat;
    	      this.encoding = defaults.encoding;
    	      this.file = defaults.file;
    	      this.fileFingerprintLines = defaults.fileFingerprintLines;
    	      this.initialPosition = defaults.initialPosition;
    	      this.logGroupName = defaults.logGroupName;
    	      this.multilineStartPattern = defaults.multilineStartPattern;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder batchCount(@Nullable Output<Integer> batchCount) {
            this.batchCount = batchCount;
            return this;
        }
        public Builder batchCount(@Nullable Integer batchCount) {
            this.batchCount = Codegen.ofNullable(batchCount);
            return this;
        }
        public Builder batchSize(@Nullable Output<Integer> batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Builder batchSize(@Nullable Integer batchSize) {
            this.batchSize = Codegen.ofNullable(batchSize);
            return this;
        }
        public Builder bufferDuration(@Nullable Output<Integer> bufferDuration) {
            this.bufferDuration = bufferDuration;
            return this;
        }
        public Builder bufferDuration(@Nullable Integer bufferDuration) {
            this.bufferDuration = Codegen.ofNullable(bufferDuration);
            return this;
        }
        public Builder datetimeFormat(@Nullable Output<String> datetimeFormat) {
            this.datetimeFormat = datetimeFormat;
            return this;
        }
        public Builder datetimeFormat(@Nullable String datetimeFormat) {
            this.datetimeFormat = Codegen.ofNullable(datetimeFormat);
            return this;
        }
        public Builder encoding(@Nullable Output<String> encoding) {
            this.encoding = encoding;
            return this;
        }
        public Builder encoding(@Nullable String encoding) {
            this.encoding = Codegen.ofNullable(encoding);
            return this;
        }
        public Builder file(Output<String> file) {
            this.file = Objects.requireNonNull(file);
            return this;
        }
        public Builder file(String file) {
            this.file = Output.of(Objects.requireNonNull(file));
            return this;
        }
        public Builder fileFingerprintLines(@Nullable Output<String> fileFingerprintLines) {
            this.fileFingerprintLines = fileFingerprintLines;
            return this;
        }
        public Builder fileFingerprintLines(@Nullable String fileFingerprintLines) {
            this.fileFingerprintLines = Codegen.ofNullable(fileFingerprintLines);
            return this;
        }
        public Builder initialPosition(@Nullable Output<String> initialPosition) {
            this.initialPosition = initialPosition;
            return this;
        }
        public Builder initialPosition(@Nullable String initialPosition) {
            this.initialPosition = Codegen.ofNullable(initialPosition);
            return this;
        }
        public Builder logGroupName(Output<String> logGroupName) {
            this.logGroupName = Objects.requireNonNull(logGroupName);
            return this;
        }
        public Builder logGroupName(String logGroupName) {
            this.logGroupName = Output.of(Objects.requireNonNull(logGroupName));
            return this;
        }
        public Builder multilineStartPattern(@Nullable Output<String> multilineStartPattern) {
            this.multilineStartPattern = multilineStartPattern;
            return this;
        }
        public Builder multilineStartPattern(@Nullable String multilineStartPattern) {
            this.multilineStartPattern = Codegen.ofNullable(multilineStartPattern);
            return this;
        }
        public Builder timeZone(@Nullable Output<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = Codegen.ofNullable(timeZone);
            return this;
        }        public GangliaLayerCloudwatchConfigurationLogStreamGetArgs build() {
            return new GangliaLayerCloudwatchConfigurationLogStreamGetArgs(batchCount, batchSize, bufferDuration, datetimeFormat, encoding, file, fileFingerprintLines, initialPosition, logGroupName, multilineStartPattern, timeZone);
        }
    }
}
