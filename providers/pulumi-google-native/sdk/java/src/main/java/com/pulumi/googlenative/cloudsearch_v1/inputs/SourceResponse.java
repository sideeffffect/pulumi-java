// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Defines sources for the suggest/search APIs.
 * 
 */
public final class SourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final SourceResponse Empty = new SourceResponse();

    /**
     * Source name for content indexed by the Indexing API.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Predefined content source for Google Apps.
     * 
     */
    @Import(name="predefinedSource", required=true)
      private final String predefinedSource;

    public String predefinedSource() {
        return this.predefinedSource;
    }

    public SourceResponse(
        String name,
        String predefinedSource) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.predefinedSource = Objects.requireNonNull(predefinedSource, "expected parameter 'predefinedSource' to be non-null");
    }

    private SourceResponse() {
        this.name = null;
        this.predefinedSource = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String predefinedSource;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.predefinedSource = defaults.predefinedSource;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder predefinedSource(String predefinedSource) {
            this.predefinedSource = Objects.requireNonNull(predefinedSource);
            return this;
        }        public SourceResponse build() {
            return new SourceResponse(name, predefinedSource);
        }
    }
}
