// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.securitycenter.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSourceResult {
    /**
     * @return The description of the source (max of 1024 characters). Example: &#34;Web Security Scanner is a web security scanner for common vulnerabilities in App Engine applications. It can automatically scan and detect four common vulnerabilities, including cross-site-scripting (XSS), Flash injection, mixed content (HTTP in HTTPS), and outdated/insecure libraries.&#34;
     * 
     */
    private final String description;
    /**
     * @return The source&#39;s display name. A source&#39;s display name must be unique amongst its siblings, for example, two sources with the same parent can&#39;t share the same display name. The display name must have a length between 1 and 64 characters (inclusive).
     * 
     */
    private final String displayName;
    /**
     * @return The relative resource name of this source. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: &#34;organizations/{organization_id}/sources/{source_id}&#34;
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetSourceResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("name") String name) {
        this.description = description;
        this.displayName = displayName;
        this.name = name;
    }

    /**
     * @return The description of the source (max of 1024 characters). Example: &#34;Web Security Scanner is a web security scanner for common vulnerabilities in App Engine applications. It can automatically scan and detect four common vulnerabilities, including cross-site-scripting (XSS), Flash injection, mixed content (HTTP in HTTPS), and outdated/insecure libraries.&#34;
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The source&#39;s display name. A source&#39;s display name must be unique amongst its siblings, for example, two sources with the same parent can&#39;t share the same display name. The display name must have a length between 1 and 64 characters (inclusive).
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The relative resource name of this source. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: &#34;organizations/{organization_id}/sources/{source_id}&#34;
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String displayName;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetSourceResult build() {
            return new GetSourceResult(description, displayName, name);
        }
    }
}
