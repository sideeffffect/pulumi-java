// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.OracleSchemaResponse;
import java.util.List;
import java.util.Objects;


/**
 * Oracle database structure.
 * 
 */
public final class OracleRdbmsResponse extends io.pulumi.resources.InvokeArgs {

    public static final OracleRdbmsResponse Empty = new OracleRdbmsResponse();

    /**
     * Oracle schemas/databases in the database server.
     * 
     */
    @InputImport(name="oracleSchemas", required=true)
      private final List<OracleSchemaResponse> oracleSchemas;

    public List<OracleSchemaResponse> getOracleSchemas() {
        return this.oracleSchemas;
    }

    public OracleRdbmsResponse(List<OracleSchemaResponse> oracleSchemas) {
        this.oracleSchemas = Objects.requireNonNull(oracleSchemas, "expected parameter 'oracleSchemas' to be non-null");
    }

    private OracleRdbmsResponse() {
        this.oracleSchemas = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleRdbmsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<OracleSchemaResponse> oracleSchemas;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleRdbmsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oracleSchemas = defaults.oracleSchemas;
        }

        public Builder oracleSchemas(List<OracleSchemaResponse> oracleSchemas) {
            this.oracleSchemas = Objects.requireNonNull(oracleSchemas);
            return this;
        }
        public OracleRdbmsResponse build() {
            return new OracleRdbmsResponse(oracleSchemas);
        }
    }
}
