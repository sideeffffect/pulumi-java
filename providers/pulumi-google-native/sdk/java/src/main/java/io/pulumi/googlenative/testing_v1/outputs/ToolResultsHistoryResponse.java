// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ToolResultsHistoryResponse {
    /**
     * A tool results history ID.
     * 
     */
    private final String historyId;
    /**
     * The cloud project that owns the tool results history.
     * 
     */
    private final String project;

    @OutputCustomType.Constructor({"historyId","project"})
    private ToolResultsHistoryResponse(
        String historyId,
        String project) {
        this.historyId = historyId;
        this.project = project;
    }

    /**
     * A tool results history ID.
     * 
    */
    public String getHistoryId() {
        return this.historyId;
    }
    /**
     * The cloud project that owns the tool results history.
     * 
    */
    public String getProject() {
        return this.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ToolResultsHistoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String historyId;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(ToolResultsHistoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.historyId = defaults.historyId;
    	      this.project = defaults.project;
        }

        public Builder setHistoryId(String historyId) {
            this.historyId = Objects.requireNonNull(historyId);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public ToolResultsHistoryResponse build() {
            return new ToolResultsHistoryResponse(historyId, project);
        }
    }
}
