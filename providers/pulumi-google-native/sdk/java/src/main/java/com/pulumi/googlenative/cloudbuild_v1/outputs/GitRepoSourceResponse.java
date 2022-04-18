// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GitRepoSourceResponse {
    /**
     * The branch or tag to use. Must start with "refs/" (required).
     * 
     */
    private final String ref;
    /**
     * See RepoType below.
     * 
     */
    private final String repoType;
    /**
     * The URI of the repo (required).
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private GitRepoSourceResponse(
        @CustomType.Parameter("ref") String ref,
        @CustomType.Parameter("repoType") String repoType,
        @CustomType.Parameter("uri") String uri) {
        this.ref = ref;
        this.repoType = repoType;
        this.uri = uri;
    }

    /**
     * The branch or tag to use. Must start with "refs/" (required).
     * 
    */
    public String ref() {
        return this.ref;
    }
    /**
     * See RepoType below.
     * 
    */
    public String repoType() {
        return this.repoType;
    }
    /**
     * The URI of the repo (required).
     * 
    */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitRepoSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ref;
        private String repoType;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GitRepoSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ref = defaults.ref;
    	      this.repoType = defaults.repoType;
    	      this.uri = defaults.uri;
        }

        public Builder ref(String ref) {
            this.ref = Objects.requireNonNull(ref);
            return this;
        }
        public Builder repoType(String repoType) {
            this.repoType = Objects.requireNonNull(repoType);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public GitRepoSourceResponse build() {
            return new GitRepoSourceResponse(ref, repoType, uri);
        }
    }
}
