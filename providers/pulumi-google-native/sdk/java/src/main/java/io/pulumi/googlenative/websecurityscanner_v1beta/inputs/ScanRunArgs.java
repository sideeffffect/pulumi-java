// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.websecurityscanner_v1beta.enums.ScanRunExecutionState;
import io.pulumi.googlenative.websecurityscanner_v1beta.enums.ScanRunResultState;
import io.pulumi.googlenative.websecurityscanner_v1beta.inputs.ScanRunErrorTraceArgs;
import io.pulumi.googlenative.websecurityscanner_v1beta.inputs.ScanRunWarningTraceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A ScanRun is a output-only resource representing an actual run of the scan. Next id: 12
 * 
 */
public final class ScanRunArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScanRunArgs Empty = new ScanRunArgs();

    /**
     * The time at which the ScanRun reached termination state - that the ScanRun is either finished or stopped by user.
     * 
     */
    @InputImport(name="endTime")
      private final @Nullable Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime == null ? Input.empty() : this.endTime;
    }

    /**
     * If result_state is an ERROR, this field provides the primary reason for scan's termination and more details, if such are available.
     * 
     */
    @InputImport(name="errorTrace")
      private final @Nullable Input<ScanRunErrorTraceArgs> errorTrace;

    public Input<ScanRunErrorTraceArgs> getErrorTrace() {
        return this.errorTrace == null ? Input.empty() : this.errorTrace;
    }

    /**
     * The execution state of the ScanRun.
     * 
     */
    @InputImport(name="executionState")
      private final @Nullable Input<ScanRunExecutionState> executionState;

    public Input<ScanRunExecutionState> getExecutionState() {
        return this.executionState == null ? Input.empty() : this.executionState;
    }

    /**
     * Whether the scan run has found any vulnerabilities.
     * 
     */
    @InputImport(name="hasVulnerabilities")
      private final @Nullable Input<Boolean> hasVulnerabilities;

    public Input<Boolean> getHasVulnerabilities() {
        return this.hasVulnerabilities == null ? Input.empty() : this.hasVulnerabilities;
    }

    /**
     * The resource name of the ScanRun. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'. The ScanRun IDs are generated by the system.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The percentage of total completion ranging from 0 to 100. If the scan is in queue, the value is 0. If the scan is running, the value ranges from 0 to 100. If the scan is finished, the value is 100.
     * 
     */
    @InputImport(name="progressPercent")
      private final @Nullable Input<Integer> progressPercent;

    public Input<Integer> getProgressPercent() {
        return this.progressPercent == null ? Input.empty() : this.progressPercent;
    }

    /**
     * The result state of the ScanRun. This field is only available after the execution state reaches "FINISHED".
     * 
     */
    @InputImport(name="resultState")
      private final @Nullable Input<ScanRunResultState> resultState;

    public Input<ScanRunResultState> getResultState() {
        return this.resultState == null ? Input.empty() : this.resultState;
    }

    /**
     * The time at which the ScanRun started.
     * 
     */
    @InputImport(name="startTime")
      private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * The number of URLs crawled during this ScanRun. If the scan is in progress, the value represents the number of URLs crawled up to now.
     * 
     */
    @InputImport(name="urlsCrawledCount")
      private final @Nullable Input<String> urlsCrawledCount;

    public Input<String> getUrlsCrawledCount() {
        return this.urlsCrawledCount == null ? Input.empty() : this.urlsCrawledCount;
    }

    /**
     * The number of URLs tested during this ScanRun. If the scan is in progress, the value represents the number of URLs tested up to now. The number of URLs tested is usually larger than the number URLS crawled because typically a crawled URL is tested with multiple test payloads.
     * 
     */
    @InputImport(name="urlsTestedCount")
      private final @Nullable Input<String> urlsTestedCount;

    public Input<String> getUrlsTestedCount() {
        return this.urlsTestedCount == null ? Input.empty() : this.urlsTestedCount;
    }

    /**
     * A list of warnings, if such are encountered during this scan run.
     * 
     */
    @InputImport(name="warningTraces")
      private final @Nullable Input<List<ScanRunWarningTraceArgs>> warningTraces;

    public Input<List<ScanRunWarningTraceArgs>> getWarningTraces() {
        return this.warningTraces == null ? Input.empty() : this.warningTraces;
    }

    public ScanRunArgs(
        @Nullable Input<String> endTime,
        @Nullable Input<ScanRunErrorTraceArgs> errorTrace,
        @Nullable Input<ScanRunExecutionState> executionState,
        @Nullable Input<Boolean> hasVulnerabilities,
        @Nullable Input<String> name,
        @Nullable Input<Integer> progressPercent,
        @Nullable Input<ScanRunResultState> resultState,
        @Nullable Input<String> startTime,
        @Nullable Input<String> urlsCrawledCount,
        @Nullable Input<String> urlsTestedCount,
        @Nullable Input<List<ScanRunWarningTraceArgs>> warningTraces) {
        this.endTime = endTime;
        this.errorTrace = errorTrace;
        this.executionState = executionState;
        this.hasVulnerabilities = hasVulnerabilities;
        this.name = name;
        this.progressPercent = progressPercent;
        this.resultState = resultState;
        this.startTime = startTime;
        this.urlsCrawledCount = urlsCrawledCount;
        this.urlsTestedCount = urlsTestedCount;
        this.warningTraces = warningTraces;
    }

    private ScanRunArgs() {
        this.endTime = Input.empty();
        this.errorTrace = Input.empty();
        this.executionState = Input.empty();
        this.hasVulnerabilities = Input.empty();
        this.name = Input.empty();
        this.progressPercent = Input.empty();
        this.resultState = Input.empty();
        this.startTime = Input.empty();
        this.urlsCrawledCount = Input.empty();
        this.urlsTestedCount = Input.empty();
        this.warningTraces = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScanRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> endTime;
        private @Nullable Input<ScanRunErrorTraceArgs> errorTrace;
        private @Nullable Input<ScanRunExecutionState> executionState;
        private @Nullable Input<Boolean> hasVulnerabilities;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> progressPercent;
        private @Nullable Input<ScanRunResultState> resultState;
        private @Nullable Input<String> startTime;
        private @Nullable Input<String> urlsCrawledCount;
        private @Nullable Input<String> urlsTestedCount;
        private @Nullable Input<List<ScanRunWarningTraceArgs>> warningTraces;

        public Builder() {
    	      // Empty
        }

        public Builder(ScanRunArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.errorTrace = defaults.errorTrace;
    	      this.executionState = defaults.executionState;
    	      this.hasVulnerabilities = defaults.hasVulnerabilities;
    	      this.name = defaults.name;
    	      this.progressPercent = defaults.progressPercent;
    	      this.resultState = defaults.resultState;
    	      this.startTime = defaults.startTime;
    	      this.urlsCrawledCount = defaults.urlsCrawledCount;
    	      this.urlsTestedCount = defaults.urlsTestedCount;
    	      this.warningTraces = defaults.warningTraces;
        }

        public Builder endTime(@Nullable Input<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder endTime(@Nullable String endTime) {
            this.endTime = Input.ofNullable(endTime);
            return this;
        }

        public Builder errorTrace(@Nullable Input<ScanRunErrorTraceArgs> errorTrace) {
            this.errorTrace = errorTrace;
            return this;
        }

        public Builder errorTrace(@Nullable ScanRunErrorTraceArgs errorTrace) {
            this.errorTrace = Input.ofNullable(errorTrace);
            return this;
        }

        public Builder executionState(@Nullable Input<ScanRunExecutionState> executionState) {
            this.executionState = executionState;
            return this;
        }

        public Builder executionState(@Nullable ScanRunExecutionState executionState) {
            this.executionState = Input.ofNullable(executionState);
            return this;
        }

        public Builder hasVulnerabilities(@Nullable Input<Boolean> hasVulnerabilities) {
            this.hasVulnerabilities = hasVulnerabilities;
            return this;
        }

        public Builder hasVulnerabilities(@Nullable Boolean hasVulnerabilities) {
            this.hasVulnerabilities = Input.ofNullable(hasVulnerabilities);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder progressPercent(@Nullable Input<Integer> progressPercent) {
            this.progressPercent = progressPercent;
            return this;
        }

        public Builder progressPercent(@Nullable Integer progressPercent) {
            this.progressPercent = Input.ofNullable(progressPercent);
            return this;
        }

        public Builder resultState(@Nullable Input<ScanRunResultState> resultState) {
            this.resultState = resultState;
            return this;
        }

        public Builder resultState(@Nullable ScanRunResultState resultState) {
            this.resultState = Input.ofNullable(resultState);
            return this;
        }

        public Builder startTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder urlsCrawledCount(@Nullable Input<String> urlsCrawledCount) {
            this.urlsCrawledCount = urlsCrawledCount;
            return this;
        }

        public Builder urlsCrawledCount(@Nullable String urlsCrawledCount) {
            this.urlsCrawledCount = Input.ofNullable(urlsCrawledCount);
            return this;
        }

        public Builder urlsTestedCount(@Nullable Input<String> urlsTestedCount) {
            this.urlsTestedCount = urlsTestedCount;
            return this;
        }

        public Builder urlsTestedCount(@Nullable String urlsTestedCount) {
            this.urlsTestedCount = Input.ofNullable(urlsTestedCount);
            return this;
        }

        public Builder warningTraces(@Nullable Input<List<ScanRunWarningTraceArgs>> warningTraces) {
            this.warningTraces = warningTraces;
            return this;
        }

        public Builder warningTraces(@Nullable List<ScanRunWarningTraceArgs> warningTraces) {
            this.warningTraces = Input.ofNullable(warningTraces);
            return this;
        }
        public ScanRunArgs build() {
            return new ScanRunArgs(endTime, errorTrace, executionState, hasVulnerabilities, name, progressPercent, resultState, startTime, urlsCrawledCount, urlsTestedCount, warningTraces);
        }
    }
}
