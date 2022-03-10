// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.StandardSqlFieldResponse;
import java.util.List;
import java.util.Objects;


public final class StandardSqlStructTypeResponse extends io.pulumi.resources.InvokeArgs {

    public static final StandardSqlStructTypeResponse Empty = new StandardSqlStructTypeResponse();

    @InputImport(name="fields", required=true)
      private final List<StandardSqlFieldResponse> fields;

    public List<StandardSqlFieldResponse> getFields() {
        return this.fields;
    }

    public StandardSqlStructTypeResponse(List<StandardSqlFieldResponse> fields) {
        this.fields = Objects.requireNonNull(fields, "expected parameter 'fields' to be non-null");
    }

    private StandardSqlStructTypeResponse() {
        this.fields = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardSqlStructTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<StandardSqlFieldResponse> fields;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardSqlStructTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
        }

        public Builder fields(List<StandardSqlFieldResponse> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }
        public StandardSqlStructTypeResponse build() {
            return new StandardSqlStructTypeResponse(fields);
        }
    }
}
