// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class StorageAccountInternetEndpointsResponse {
    /**
     * Gets the blob endpoint.
     * 
     */
    private final String blob;
    /**
     * Gets the dfs endpoint.
     * 
     */
    private final String dfs;
    /**
     * Gets the file endpoint.
     * 
     */
    private final String file;
    /**
     * Gets the web endpoint.
     * 
     */
    private final String web;

    @OutputCustomType.Constructor({"blob","dfs","file","web"})
    private StorageAccountInternetEndpointsResponse(
        String blob,
        String dfs,
        String file,
        String web) {
        this.blob = blob;
        this.dfs = dfs;
        this.file = file;
        this.web = web;
    }

    /**
     * Gets the blob endpoint.
     * 
    */
    public String getBlob() {
        return this.blob;
    }
    /**
     * Gets the dfs endpoint.
     * 
    */
    public String getDfs() {
        return this.dfs;
    }
    /**
     * Gets the file endpoint.
     * 
    */
    public String getFile() {
        return this.file;
    }
    /**
     * Gets the web endpoint.
     * 
    */
    public String getWeb() {
        return this.web;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountInternetEndpointsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String blob;
        private String dfs;
        private String file;
        private String web;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountInternetEndpointsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blob = defaults.blob;
    	      this.dfs = defaults.dfs;
    	      this.file = defaults.file;
    	      this.web = defaults.web;
        }

        public Builder setBlob(String blob) {
            this.blob = Objects.requireNonNull(blob);
            return this;
        }

        public Builder setDfs(String dfs) {
            this.dfs = Objects.requireNonNull(dfs);
            return this;
        }

        public Builder setFile(String file) {
            this.file = Objects.requireNonNull(file);
            return this;
        }

        public Builder setWeb(String web) {
            this.web = Objects.requireNonNull(web);
            return this;
        }
        public StorageAccountInternetEndpointsResponse build() {
            return new StorageAccountInternetEndpointsResponse(blob, dfs, file, web);
        }
    }
}
