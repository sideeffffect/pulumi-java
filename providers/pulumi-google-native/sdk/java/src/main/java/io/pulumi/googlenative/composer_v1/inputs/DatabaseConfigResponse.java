// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The configuration of Cloud SQL instance that is used by the Apache Airflow software. Supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
 * 
 */
public final class DatabaseConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final DatabaseConfigResponse Empty = new DatabaseConfigResponse();

    /**
     * Optional. Cloud SQL machine type used by Airflow database. It has to be one of: db-n1-standard-2, db-n1-standard-4, db-n1-standard-8 or db-n1-standard-16. If not specified, db-n1-standard-2 will be used.
     * 
     */
    @InputImport(name="machineType", required=true)
      private final String machineType;

    public String getMachineType() {
        return this.machineType;
    }

    public DatabaseConfigResponse(String machineType) {
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
    }

    private DatabaseConfigResponse() {
        this.machineType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String machineType;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.machineType = defaults.machineType;
        }

        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public DatabaseConfigResponse build() {
            return new DatabaseConfigResponse(machineType);
        }
    }
}
