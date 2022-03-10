// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.SsisLogLocationType;
import io.pulumi.azurenative.datafactory.inputs.SSISAccessCredentialArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SSIS package execution log location
 * 
 */
public final class SSISLogLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SSISLogLocationArgs Empty = new SSISLogLocationArgs();

    /**
     * The package execution log access credential.
     * 
     */
    @InputImport(name="accessCredential")
      private final @Nullable Input<SSISAccessCredentialArgs> accessCredential;

    public Input<SSISAccessCredentialArgs> getAccessCredential() {
        return this.accessCredential == null ? Input.empty() : this.accessCredential;
    }

    /**
     * The SSIS package execution log path. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="logPath", required=true)
      private final Input<Object> logPath;

    public Input<Object> getLogPath() {
        return this.logPath;
    }

    /**
     * Specifies the interval to refresh log. The default interval is 5 minutes. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="logRefreshInterval")
      private final @Nullable Input<Object> logRefreshInterval;

    public Input<Object> getLogRefreshInterval() {
        return this.logRefreshInterval == null ? Input.empty() : this.logRefreshInterval;
    }

    /**
     * The type of SSIS log location.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<Either<String,SsisLogLocationType>> type;

    public Input<Either<String,SsisLogLocationType>> getType() {
        return this.type;
    }

    public SSISLogLocationArgs(
        @Nullable Input<SSISAccessCredentialArgs> accessCredential,
        Input<Object> logPath,
        @Nullable Input<Object> logRefreshInterval,
        Input<Either<String,SsisLogLocationType>> type) {
        this.accessCredential = accessCredential;
        this.logPath = Objects.requireNonNull(logPath, "expected parameter 'logPath' to be non-null");
        this.logRefreshInterval = logRefreshInterval;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SSISLogLocationArgs() {
        this.accessCredential = Input.empty();
        this.logPath = Input.empty();
        this.logRefreshInterval = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SSISLogLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SSISAccessCredentialArgs> accessCredential;
        private Input<Object> logPath;
        private @Nullable Input<Object> logRefreshInterval;
        private Input<Either<String,SsisLogLocationType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SSISLogLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessCredential = defaults.accessCredential;
    	      this.logPath = defaults.logPath;
    	      this.logRefreshInterval = defaults.logRefreshInterval;
    	      this.type = defaults.type;
        }

        public Builder accessCredential(@Nullable Input<SSISAccessCredentialArgs> accessCredential) {
            this.accessCredential = accessCredential;
            return this;
        }

        public Builder accessCredential(@Nullable SSISAccessCredentialArgs accessCredential) {
            this.accessCredential = Input.ofNullable(accessCredential);
            return this;
        }

        public Builder logPath(Input<Object> logPath) {
            this.logPath = Objects.requireNonNull(logPath);
            return this;
        }

        public Builder logPath(Object logPath) {
            this.logPath = Input.of(Objects.requireNonNull(logPath));
            return this;
        }

        public Builder logRefreshInterval(@Nullable Input<Object> logRefreshInterval) {
            this.logRefreshInterval = logRefreshInterval;
            return this;
        }

        public Builder logRefreshInterval(@Nullable Object logRefreshInterval) {
            this.logRefreshInterval = Input.ofNullable(logRefreshInterval);
            return this;
        }

        public Builder type(Input<Either<String,SsisLogLocationType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(Either<String,SsisLogLocationType> type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public SSISLogLocationArgs build() {
            return new SSISLogLocationArgs(accessCredential, logPath, logRefreshInterval, type);
        }
    }
}
