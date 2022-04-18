// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class SubjectResponse extends com.pulumi.resources.InvokeArgs {

    public static final SubjectResponse Empty = new SubjectResponse();

    /**
     * "": "" Algorithms can be e.g. sha256, sha512 See https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
     * 
     */
    @Import(name="digest", required=true)
      private final Map<String,String> digest;

    public Map<String,String> digest() {
        return this.digest;
    }

    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    public SubjectResponse(
        Map<String,String> digest,
        String name) {
        this.digest = Objects.requireNonNull(digest, "expected parameter 'digest' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private SubjectResponse() {
        this.digest = Map.of();
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> digest;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digest = defaults.digest;
    	      this.name = defaults.name;
        }

        public Builder digest(Map<String,String> digest) {
            this.digest = Objects.requireNonNull(digest);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public SubjectResponse build() {
            return new SubjectResponse(digest, name);
        }
    }
}
