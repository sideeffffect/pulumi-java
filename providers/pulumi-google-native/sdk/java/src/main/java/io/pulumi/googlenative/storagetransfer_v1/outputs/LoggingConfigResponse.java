// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class LoggingConfigResponse {
    /**
     * For transfers with a PosixFilesystem source, this option enables the Cloud Storage transfer logs for this transfer.
     * 
     */
    private final Boolean enableOnpremGcsTransferLogs;
    /**
     * States in which `log_actions` are logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
     * 
     */
    private final List<String> logActionStates;
    /**
     * Specifies the actions to be logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
     * 
     */
    private final List<String> logActions;

    @OutputCustomType.Constructor
    private LoggingConfigResponse(
        @OutputCustomType.Parameter("enableOnpremGcsTransferLogs") Boolean enableOnpremGcsTransferLogs,
        @OutputCustomType.Parameter("logActionStates") List<String> logActionStates,
        @OutputCustomType.Parameter("logActions") List<String> logActions) {
        this.enableOnpremGcsTransferLogs = enableOnpremGcsTransferLogs;
        this.logActionStates = logActionStates;
        this.logActions = logActions;
    }

    /**
     * For transfers with a PosixFilesystem source, this option enables the Cloud Storage transfer logs for this transfer.
     * 
    */
    public Boolean getEnableOnpremGcsTransferLogs() {
        return this.enableOnpremGcsTransferLogs;
    }
    /**
     * States in which `log_actions` are logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
     * 
    */
    public List<String> getLogActionStates() {
        return this.logActionStates;
    }
    /**
     * Specifies the actions to be logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
     * 
    */
    public List<String> getLogActions() {
        return this.logActions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableOnpremGcsTransferLogs;
        private List<String> logActionStates;
        private List<String> logActions;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableOnpremGcsTransferLogs = defaults.enableOnpremGcsTransferLogs;
    	      this.logActionStates = defaults.logActionStates;
    	      this.logActions = defaults.logActions;
        }

        public Builder enableOnpremGcsTransferLogs(Boolean enableOnpremGcsTransferLogs) {
            this.enableOnpremGcsTransferLogs = Objects.requireNonNull(enableOnpremGcsTransferLogs);
            return this;
        }

        public Builder logActionStates(List<String> logActionStates) {
            this.logActionStates = Objects.requireNonNull(logActionStates);
            return this;
        }

        public Builder logActions(List<String> logActions) {
            this.logActions = Objects.requireNonNull(logActions);
            return this;
        }
        public LoggingConfigResponse build() {
            return new LoggingConfigResponse(enableOnpremGcsTransferLogs, logActionStates, logActions);
        }
    }
}
