// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datacatalog_v1.enums.GoogleCloudDatacatalogV1RoutineSpecRoutineType;
import com.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs;
import com.pulumi.googlenative.datacatalog_v1.inputs.GoogleCloudDatacatalogV1RoutineSpecArgumentArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specification that applies to a routine. Valid only for entries with the `ROUTINE` type.
 * 
 */
public final class GoogleCloudDatacatalogV1RoutineSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1RoutineSpecArgs Empty = new GoogleCloudDatacatalogV1RoutineSpecArgs();

    /**
     * Fields specific for BigQuery routines.
     * 
     */
    @Import(name="bigqueryRoutineSpec")
    private @Nullable Output<GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs> bigqueryRoutineSpec;

    public Optional<Output<GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs>> bigqueryRoutineSpec() {
        return Optional.ofNullable(this.bigqueryRoutineSpec);
    }

    /**
     * The body of the routine.
     * 
     */
    @Import(name="definitionBody")
    private @Nullable Output<String> definitionBody;

    public Optional<Output<String>> definitionBody() {
        return Optional.ofNullable(this.definitionBody);
    }

    /**
     * The language the routine is written in. The exact value depends on the source system. For BigQuery routines, possible values are: * `SQL` * `JAVASCRIPT`
     * 
     */
    @Import(name="language")
    private @Nullable Output<String> language;

    public Optional<Output<String>> language() {
        return Optional.ofNullable(this.language);
    }

    /**
     * Return type of the argument. The exact value depends on the source system and the language.
     * 
     */
    @Import(name="returnType")
    private @Nullable Output<String> returnType;

    public Optional<Output<String>> returnType() {
        return Optional.ofNullable(this.returnType);
    }

    /**
     * Arguments of the routine.
     * 
     */
    @Import(name="routineArguments")
    private @Nullable Output<List<GoogleCloudDatacatalogV1RoutineSpecArgumentArgs>> routineArguments;

    public Optional<Output<List<GoogleCloudDatacatalogV1RoutineSpecArgumentArgs>>> routineArguments() {
        return Optional.ofNullable(this.routineArguments);
    }

    /**
     * The type of the routine.
     * 
     */
    @Import(name="routineType")
    private @Nullable Output<GoogleCloudDatacatalogV1RoutineSpecRoutineType> routineType;

    public Optional<Output<GoogleCloudDatacatalogV1RoutineSpecRoutineType>> routineType() {
        return Optional.ofNullable(this.routineType);
    }

    private GoogleCloudDatacatalogV1RoutineSpecArgs() {}

    private GoogleCloudDatacatalogV1RoutineSpecArgs(GoogleCloudDatacatalogV1RoutineSpecArgs $) {
        this.bigqueryRoutineSpec = $.bigqueryRoutineSpec;
        this.definitionBody = $.definitionBody;
        this.language = $.language;
        this.returnType = $.returnType;
        this.routineArguments = $.routineArguments;
        this.routineType = $.routineType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatacatalogV1RoutineSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1RoutineSpecArgs $;

        public Builder() {
            $ = new GoogleCloudDatacatalogV1RoutineSpecArgs();
        }

        public Builder(GoogleCloudDatacatalogV1RoutineSpecArgs defaults) {
            $ = new GoogleCloudDatacatalogV1RoutineSpecArgs(Objects.requireNonNull(defaults));
        }

        public Builder bigqueryRoutineSpec(@Nullable Output<GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs> bigqueryRoutineSpec) {
            $.bigqueryRoutineSpec = bigqueryRoutineSpec;
            return this;
        }

        public Builder bigqueryRoutineSpec(GoogleCloudDatacatalogV1BigQueryRoutineSpecArgs bigqueryRoutineSpec) {
            return bigqueryRoutineSpec(Output.of(bigqueryRoutineSpec));
        }

        public Builder definitionBody(@Nullable Output<String> definitionBody) {
            $.definitionBody = definitionBody;
            return this;
        }

        public Builder definitionBody(String definitionBody) {
            return definitionBody(Output.of(definitionBody));
        }

        public Builder language(@Nullable Output<String> language) {
            $.language = language;
            return this;
        }

        public Builder language(String language) {
            return language(Output.of(language));
        }

        public Builder returnType(@Nullable Output<String> returnType) {
            $.returnType = returnType;
            return this;
        }

        public Builder returnType(String returnType) {
            return returnType(Output.of(returnType));
        }

        public Builder routineArguments(@Nullable Output<List<GoogleCloudDatacatalogV1RoutineSpecArgumentArgs>> routineArguments) {
            $.routineArguments = routineArguments;
            return this;
        }

        public Builder routineArguments(List<GoogleCloudDatacatalogV1RoutineSpecArgumentArgs> routineArguments) {
            return routineArguments(Output.of(routineArguments));
        }

        public Builder routineArguments(GoogleCloudDatacatalogV1RoutineSpecArgumentArgs... routineArguments) {
            return routineArguments(List.of(routineArguments));
        }

        public Builder routineType(@Nullable Output<GoogleCloudDatacatalogV1RoutineSpecRoutineType> routineType) {
            $.routineType = routineType;
            return this;
        }

        public Builder routineType(GoogleCloudDatacatalogV1RoutineSpecRoutineType routineType) {
            return routineType(Output.of(routineType));
        }

        public GoogleCloudDatacatalogV1RoutineSpecArgs build() {
            return $;
        }
    }

}
