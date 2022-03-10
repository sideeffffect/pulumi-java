// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains the versioned name and the URL for one SearchParameter.
 * 
 */
public final class SearchParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final SearchParameterArgs Empty = new SearchParameterArgs();

    /**
     * The canonical url of the search parameter resource.
     * 
     */
    @InputImport(name="canonicalUrl")
      private final @Nullable Input<String> canonicalUrl;

    public Input<String> getCanonicalUrl() {
        return this.canonicalUrl == null ? Input.empty() : this.canonicalUrl;
    }

    /**
     * The versioned name of the search parameter resource. The format is projects/{project-id}/locations/{location}/datasets/{dataset-id}/fhirStores/{fhirStore-id}/fhir/SearchParameter/{resource-id}/_history/{version-id} For fhir stores with disable_resource_versioning=true, the format is projects/{project-id}/locations/{location}/datasets/{dataset-id}/fhirStores/{fhirStore-id}/fhir/SearchParameter/{resource-id}/
     * 
     */
    @InputImport(name="parameter")
      private final @Nullable Input<String> parameter;

    public Input<String> getParameter() {
        return this.parameter == null ? Input.empty() : this.parameter;
    }

    public SearchParameterArgs(
        @Nullable Input<String> canonicalUrl,
        @Nullable Input<String> parameter) {
        this.canonicalUrl = canonicalUrl;
        this.parameter = parameter;
    }

    private SearchParameterArgs() {
        this.canonicalUrl = Input.empty();
        this.parameter = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SearchParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> canonicalUrl;
        private @Nullable Input<String> parameter;

        public Builder() {
    	      // Empty
        }

        public Builder(SearchParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canonicalUrl = defaults.canonicalUrl;
    	      this.parameter = defaults.parameter;
        }

        public Builder canonicalUrl(@Nullable Input<String> canonicalUrl) {
            this.canonicalUrl = canonicalUrl;
            return this;
        }

        public Builder canonicalUrl(@Nullable String canonicalUrl) {
            this.canonicalUrl = Input.ofNullable(canonicalUrl);
            return this;
        }

        public Builder parameter(@Nullable Input<String> parameter) {
            this.parameter = parameter;
            return this;
        }

        public Builder parameter(@Nullable String parameter) {
            this.parameter = Input.ofNullable(parameter);
            return this;
        }
        public SearchParameterArgs build() {
            return new SearchParameterArgs(canonicalUrl, parameter);
        }
    }
}
