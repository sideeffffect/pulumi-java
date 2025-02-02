// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.healthcare_v1beta1.outputs.SearchParameterResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SearchConfigResponse {
    /**
     * @return A list of search parameters in this FHIR store that are used to configure this FHIR store.
     * 
     */
    private final List<SearchParameterResponse> searchParameters;

    @CustomType.Constructor
    private SearchConfigResponse(@CustomType.Parameter("searchParameters") List<SearchParameterResponse> searchParameters) {
        this.searchParameters = searchParameters;
    }

    /**
     * @return A list of search parameters in this FHIR store that are used to configure this FHIR store.
     * 
     */
    public List<SearchParameterResponse> searchParameters() {
        return this.searchParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SearchConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SearchParameterResponse> searchParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(SearchConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.searchParameters = defaults.searchParameters;
        }

        public Builder searchParameters(List<SearchParameterResponse> searchParameters) {
            this.searchParameters = Objects.requireNonNull(searchParameters);
            return this;
        }
        public Builder searchParameters(SearchParameterResponse... searchParameters) {
            return searchParameters(List.of(searchParameters));
        }        public SearchConfigResponse build() {
            return new SearchConfigResponse(searchParameters);
        }
    }
}
