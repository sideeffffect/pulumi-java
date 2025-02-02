// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.applicationinsights.outputs;

import com.pulumi.awsnative.applicationinsights.enums.ApplicationLogEncoding;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationLog {
    /**
     * @return The type of encoding of the logs to be monitored.
     * 
     */
    private final @Nullable ApplicationLogEncoding encoding;
    /**
     * @return The CloudWatch log group name to be associated to the monitored log.
     * 
     */
    private final @Nullable String logGroupName;
    /**
     * @return The path of the logs to be monitored.
     * 
     */
    private final @Nullable String logPath;
    /**
     * @return The log type decides the log patterns against which Application Insights analyzes the log.
     * 
     */
    private final String logType;
    /**
     * @return The name of the log pattern set.
     * 
     */
    private final @Nullable String patternSet;

    @CustomType.Constructor
    private ApplicationLog(
        @CustomType.Parameter("encoding") @Nullable ApplicationLogEncoding encoding,
        @CustomType.Parameter("logGroupName") @Nullable String logGroupName,
        @CustomType.Parameter("logPath") @Nullable String logPath,
        @CustomType.Parameter("logType") String logType,
        @CustomType.Parameter("patternSet") @Nullable String patternSet) {
        this.encoding = encoding;
        this.logGroupName = logGroupName;
        this.logPath = logPath;
        this.logType = logType;
        this.patternSet = patternSet;
    }

    /**
     * @return The type of encoding of the logs to be monitored.
     * 
     */
    public Optional<ApplicationLogEncoding> encoding() {
        return Optional.ofNullable(this.encoding);
    }
    /**
     * @return The CloudWatch log group name to be associated to the monitored log.
     * 
     */
    public Optional<String> logGroupName() {
        return Optional.ofNullable(this.logGroupName);
    }
    /**
     * @return The path of the logs to be monitored.
     * 
     */
    public Optional<String> logPath() {
        return Optional.ofNullable(this.logPath);
    }
    /**
     * @return The log type decides the log patterns against which Application Insights analyzes the log.
     * 
     */
    public String logType() {
        return this.logType;
    }
    /**
     * @return The name of the log pattern set.
     * 
     */
    public Optional<String> patternSet() {
        return Optional.ofNullable(this.patternSet);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationLog defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApplicationLogEncoding encoding;
        private @Nullable String logGroupName;
        private @Nullable String logPath;
        private String logType;
        private @Nullable String patternSet;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.logGroupName = defaults.logGroupName;
    	      this.logPath = defaults.logPath;
    	      this.logType = defaults.logType;
    	      this.patternSet = defaults.patternSet;
        }

        public Builder encoding(@Nullable ApplicationLogEncoding encoding) {
            this.encoding = encoding;
            return this;
        }
        public Builder logGroupName(@Nullable String logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }
        public Builder logPath(@Nullable String logPath) {
            this.logPath = logPath;
            return this;
        }
        public Builder logType(String logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }
        public Builder patternSet(@Nullable String patternSet) {
            this.patternSet = patternSet;
            return this;
        }        public ApplicationLog build() {
            return new ApplicationLog(encoding, logGroupName, logPath, logType, patternSet);
        }
    }
}
