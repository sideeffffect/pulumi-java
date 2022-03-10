// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.StaticSiteUserARMResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ListStaticSiteUsersResult {
    /**
     * Link to next page of resources.
     * 
     */
    private final String nextLink;
    /**
     * Collection of resources.
     * 
     */
    private final List<StaticSiteUserARMResourceResponse> value;

    @OutputCustomType.Constructor
    private ListStaticSiteUsersResult(
        @OutputCustomType.Parameter("nextLink") String nextLink,
        @OutputCustomType.Parameter("value") List<StaticSiteUserARMResourceResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * Link to next page of resources.
     * 
    */
    public String getNextLink() {
        return this.nextLink;
    }
    /**
     * Collection of resources.
     * 
    */
    public List<StaticSiteUserARMResourceResponse> getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListStaticSiteUsersResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextLink;
        private List<StaticSiteUserARMResourceResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListStaticSiteUsersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(String nextLink) {
            this.nextLink = Objects.requireNonNull(nextLink);
            return this;
        }

        public Builder value(List<StaticSiteUserARMResourceResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ListStaticSiteUsersResult build() {
            return new ListStaticSiteUsersResult(nextLink, value);
        }
    }
}
