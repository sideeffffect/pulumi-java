// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.ReportableExceptionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ConnectToTargetSqlMISyncTaskOutputResponse {
    /**
     * Target server brand version
     * 
     */
    private final String targetServerBrandVersion;
    /**
     * Target server version
     * 
     */
    private final String targetServerVersion;
    /**
     * Validation errors
     * 
     */
    private final List<ReportableExceptionResponse> validationErrors;

    @OutputCustomType.Constructor
    private ConnectToTargetSqlMISyncTaskOutputResponse(
        @OutputCustomType.Parameter("targetServerBrandVersion") String targetServerBrandVersion,
        @OutputCustomType.Parameter("targetServerVersion") String targetServerVersion,
        @OutputCustomType.Parameter("validationErrors") List<ReportableExceptionResponse> validationErrors) {
        this.targetServerBrandVersion = targetServerBrandVersion;
        this.targetServerVersion = targetServerVersion;
        this.validationErrors = validationErrors;
    }

    /**
     * Target server brand version
     * 
    */
    public String getTargetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }
    /**
     * Target server version
     * 
    */
    public String getTargetServerVersion() {
        return this.targetServerVersion;
    }
    /**
     * Validation errors
     * 
    */
    public List<ReportableExceptionResponse> getValidationErrors() {
        return this.validationErrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetSqlMISyncTaskOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String targetServerBrandVersion;
        private String targetServerVersion;
        private List<ReportableExceptionResponse> validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetSqlMISyncTaskOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetServerBrandVersion = defaults.targetServerBrandVersion;
    	      this.targetServerVersion = defaults.targetServerVersion;
    	      this.validationErrors = defaults.validationErrors;
        }

        public Builder targetServerBrandVersion(String targetServerBrandVersion) {
            this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion);
            return this;
        }

        public Builder targetServerVersion(String targetServerVersion) {
            this.targetServerVersion = Objects.requireNonNull(targetServerVersion);
            return this;
        }

        public Builder validationErrors(List<ReportableExceptionResponse> validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }
        public ConnectToTargetSqlMISyncTaskOutputResponse build() {
            return new ConnectToTargetSqlMISyncTaskOutputResponse(targetServerBrandVersion, targetServerVersion, validationErrors);
        }
    }
}
