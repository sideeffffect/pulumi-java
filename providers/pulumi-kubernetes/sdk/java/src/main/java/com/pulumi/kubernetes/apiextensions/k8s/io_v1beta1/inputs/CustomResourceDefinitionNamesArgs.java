// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition
 * 
 */
public final class CustomResourceDefinitionNamesArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomResourceDefinitionNamesArgs Empty = new CustomResourceDefinitionNamesArgs();

    /**
     * categories is a list of grouped resources this custom resource belongs to (e.g. 'all'). This is published in API discovery documents, and used by clients to support invocations like `kubectl get all`.
     * 
     */
    @Import(name="categories")
      private final @Nullable Output<List<String>> categories;

    public Output<List<String>> categories() {
        return this.categories == null ? Codegen.empty() : this.categories;
    }

    /**
     * kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use this value as the `kind` attribute in API calls.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * listKind is the serialized kind of the list for this resource. Defaults to "`kind`List".
     * 
     */
    @Import(name="listKind")
      private final @Nullable Output<String> listKind;

    public Output<String> listKind() {
        return this.listKind == null ? Codegen.empty() : this.listKind;
    }

    /**
     * plural is the plural name of the resource to serve. The custom resources are served under `/apis/<group>/<version>/.../<plural>`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`). Must be all lowercase.
     * 
     */
    @Import(name="plural", required=true)
      private final Output<String> plural;

    public Output<String> plural() {
        return this.plural;
    }

    /**
     * shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like `kubectl get <shortname>`. It must be all lowercase.
     * 
     */
    @Import(name="shortNames")
      private final @Nullable Output<List<String>> shortNames;

    public Output<List<String>> shortNames() {
        return this.shortNames == null ? Codegen.empty() : this.shortNames;
    }

    /**
     * singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased `kind`.
     * 
     */
    @Import(name="singular")
      private final @Nullable Output<String> singular;

    public Output<String> singular() {
        return this.singular == null ? Codegen.empty() : this.singular;
    }

    public CustomResourceDefinitionNamesArgs(
        @Nullable Output<List<String>> categories,
        Output<String> kind,
        @Nullable Output<String> listKind,
        Output<String> plural,
        @Nullable Output<List<String>> shortNames,
        @Nullable Output<String> singular) {
        this.categories = categories;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.listKind = listKind;
        this.plural = Objects.requireNonNull(plural, "expected parameter 'plural' to be non-null");
        this.shortNames = shortNames;
        this.singular = singular;
    }

    private CustomResourceDefinitionNamesArgs() {
        this.categories = Codegen.empty();
        this.kind = Codegen.empty();
        this.listKind = Codegen.empty();
        this.plural = Codegen.empty();
        this.shortNames = Codegen.empty();
        this.singular = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceDefinitionNamesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> categories;
        private Output<String> kind;
        private @Nullable Output<String> listKind;
        private Output<String> plural;
        private @Nullable Output<List<String>> shortNames;
        private @Nullable Output<String> singular;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceDefinitionNamesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.kind = defaults.kind;
    	      this.listKind = defaults.listKind;
    	      this.plural = defaults.plural;
    	      this.shortNames = defaults.shortNames;
    	      this.singular = defaults.singular;
        }

        public Builder categories(@Nullable Output<List<String>> categories) {
            this.categories = categories;
            return this;
        }
        public Builder categories(@Nullable List<String> categories) {
            this.categories = Codegen.ofNullable(categories);
            return this;
        }
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder listKind(@Nullable Output<String> listKind) {
            this.listKind = listKind;
            return this;
        }
        public Builder listKind(@Nullable String listKind) {
            this.listKind = Codegen.ofNullable(listKind);
            return this;
        }
        public Builder plural(Output<String> plural) {
            this.plural = Objects.requireNonNull(plural);
            return this;
        }
        public Builder plural(String plural) {
            this.plural = Output.of(Objects.requireNonNull(plural));
            return this;
        }
        public Builder shortNames(@Nullable Output<List<String>> shortNames) {
            this.shortNames = shortNames;
            return this;
        }
        public Builder shortNames(@Nullable List<String> shortNames) {
            this.shortNames = Codegen.ofNullable(shortNames);
            return this;
        }
        public Builder shortNames(String... shortNames) {
            return shortNames(List.of(shortNames));
        }
        public Builder singular(@Nullable Output<String> singular) {
            this.singular = singular;
            return this;
        }
        public Builder singular(@Nullable String singular) {
            this.singular = Codegen.ofNullable(singular);
            return this;
        }        public CustomResourceDefinitionNamesArgs build() {
            return new CustomResourceDefinitionNamesArgs(categories, kind, listKind, plural, shortNames, singular);
        }
    }
}
