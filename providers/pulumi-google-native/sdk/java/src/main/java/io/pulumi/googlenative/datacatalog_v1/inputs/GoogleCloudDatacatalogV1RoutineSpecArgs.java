// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datacatalog_v1.enums.GoogleCloudDatacatalogV1RoutineSpecRoutineType;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs;
import io.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1RoutineSpecArgumentArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specification that applies to a routine. Valid only for entries with the `ROUTINE` type.
 * 
 */
public final class GoogleCloudDatacatalogV1RoutineSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1RoutineSpecArgs Empty = new GoogleCloudDatacatalogV1RoutineSpecArgs();

    /**
     * Fields specific for BigQuery routines.
     * 
     */
    @InputImport(name="bigqueryRoutineSpec")
      private final @Nullable Input<GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs> bigqueryRoutineSpec;

    public Input<GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs> getBigqueryRoutineSpec() {
        return this.bigqueryRoutineSpec == null ? Input.empty() : this.bigqueryRoutineSpec;
    }

    /**
     * The body of the routine.
     * 
     */
    @InputImport(name="definitionBody")
      private final @Nullable Input<String> definitionBody;

    public Input<String> getDefinitionBody() {
        return this.definitionBody == null ? Input.empty() : this.definitionBody;
    }

    /**
     * The language the routine is written in. The exact value depends on the source system. For BigQuery routines, possible values are: * `SQL` * `JAVASCRIPT`
     * 
     */
    @InputImport(name="language")
      private final @Nullable Input<String> language;

    public Input<String> getLanguage() {
        return this.language == null ? Input.empty() : this.language;
    }

    /**
     * Return type of the argument. The exact value depends on the source system and the language.
     * 
     */
    @InputImport(name="returnType")
      private final @Nullable Input<String> returnType;

    public Input<String> getReturnType() {
        return this.returnType == null ? Input.empty() : this.returnType;
    }

    /**
     * Arguments of the routine.
     * 
     */
    @InputImport(name="routineArguments")
      private final @Nullable Input<List<GoogleCloudDatacatalogV1RoutineSpecArgumentArgs>> routineArguments;

    public Input<List<GoogleCloudDatacatalogV1RoutineSpecArgumentArgs>> getRoutineArguments() {
        return this.routineArguments == null ? Input.empty() : this.routineArguments;
    }

    /**
     * The type of the routine.
     * 
     */
    @InputImport(name="routineType")
      private final @Nullable Input<GoogleCloudDatacatalogV1RoutineSpecRoutineType> routineType;

    public Input<GoogleCloudDatacatalogV1RoutineSpecRoutineType> getRoutineType() {
        return this.routineType == null ? Input.empty() : this.routineType;
    }

    public GoogleCloudDatacatalogV1RoutineSpecArgs(
        @Nullable Input<GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs> bigqueryRoutineSpec,
        @Nullable Input<String> definitionBody,
        @Nullable Input<String> language,
        @Nullable Input<String> returnType,
        @Nullable Input<List<GoogleCloudDatacatalogV1RoutineSpecArgumentArgs>> routineArguments,
        @Nullable Input<GoogleCloudDatacatalogV1RoutineSpecRoutineType> routineType) {
        this.bigqueryRoutineSpec = bigqueryRoutineSpec;
        this.definitionBody = definitionBody;
        this.language = language;
        this.returnType = returnType;
        this.routineArguments = routineArguments;
        this.routineType = routineType;
    }

    private GoogleCloudDatacatalogV1RoutineSpecArgs() {
        this.bigqueryRoutineSpec = Input.empty();
        this.definitionBody = Input.empty();
        this.language = Input.empty();
        this.returnType = Input.empty();
        this.routineArguments = Input.empty();
        this.routineType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1RoutineSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs> bigqueryRoutineSpec;
        private @Nullable Input<String> definitionBody;
        private @Nullable Input<String> language;
        private @Nullable Input<String> returnType;
        private @Nullable Input<List<GoogleCloudDatacatalogV1RoutineSpecArgumentArgs>> routineArguments;
        private @Nullable Input<GoogleCloudDatacatalogV1RoutineSpecRoutineType> routineType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1RoutineSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryRoutineSpec = defaults.bigqueryRoutineSpec;
    	      this.definitionBody = defaults.definitionBody;
    	      this.language = defaults.language;
    	      this.returnType = defaults.returnType;
    	      this.routineArguments = defaults.routineArguments;
    	      this.routineType = defaults.routineType;
        }

        public Builder bigqueryRoutineSpec(@Nullable Input<GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs> bigqueryRoutineSpec) {
            this.bigqueryRoutineSpec = bigqueryRoutineSpec;
            return this;
        }

        public Builder bigqueryRoutineSpec(@Nullable GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs bigqueryRoutineSpec) {
            this.bigqueryRoutineSpec = Input.ofNullable(bigqueryRoutineSpec);
            return this;
        }

        public Builder definitionBody(@Nullable Input<String> definitionBody) {
            this.definitionBody = definitionBody;
            return this;
        }

        public Builder definitionBody(@Nullable String definitionBody) {
            this.definitionBody = Input.ofNullable(definitionBody);
            return this;
        }

        public Builder language(@Nullable Input<String> language) {
            this.language = language;
            return this;
        }

        public Builder language(@Nullable String language) {
            this.language = Input.ofNullable(language);
            return this;
        }

        public Builder returnType(@Nullable Input<String> returnType) {
            this.returnType = returnType;
            return this;
        }

        public Builder returnType(@Nullable String returnType) {
            this.returnType = Input.ofNullable(returnType);
            return this;
        }

        public Builder routineArguments(@Nullable Input<List<GoogleCloudDatacatalogV1RoutineSpecArgumentArgs>> routineArguments) {
            this.routineArguments = routineArguments;
            return this;
        }

        public Builder routineArguments(@Nullable List<GoogleCloudDatacatalogV1RoutineSpecArgumentArgs> routineArguments) {
            this.routineArguments = Input.ofNullable(routineArguments);
            return this;
        }

        public Builder routineType(@Nullable Input<GoogleCloudDatacatalogV1RoutineSpecRoutineType> routineType) {
            this.routineType = routineType;
            return this;
        }

        public Builder routineType(@Nullable GoogleCloudDatacatalogV1RoutineSpecRoutineType routineType) {
            this.routineType = Input.ofNullable(routineType);
            return this;
        }
        public GoogleCloudDatacatalogV1RoutineSpecArgs build() {
            return new GoogleCloudDatacatalogV1RoutineSpecArgs(bigqueryRoutineSpec, definitionBody, language, returnType, routineArguments, routineType);
        }
    }
}
