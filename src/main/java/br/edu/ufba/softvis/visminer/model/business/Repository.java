package br.edu.ufba.softvis.visminer.model.business;

import java.util.List;

import br.edu.ufba.softvis.visminer.constant.WebRepositoryType;
import br.edu.ufba.softvis.visminer.constant.RepositoryType;

/**
 * @author Felipe Gustavo de Souza Gomes (felipegustavo1000@gmail.com)
 * @version 0.9
 * User friendly repository bean class.
 * This class will be used for user interface.
 */

public class Repository {

	private int id;
	private String description;
	private String name;
	private String path;
	private String remoteUrl;
	private RepositoryType type;
	private WebRepositoryType serviceType;
	private String uid;
	
	private List<Committer> committers;
	private List<Tree> trees;
	private Project project;
	
	public Repository(){}
	
	/**
	 * @param id
	 * @param description
	 * @param name
	 * @param path
	 * @param remoteUrl
	 * @param type
	 * @param serviceType
	 * @param uid
	 */
	public Repository(int id, String description, String name, String path,
			String remoteUrl, RepositoryType type,
			WebRepositoryType serviceType, String uid) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
		this.path = path;
		this.remoteUrl = remoteUrl;
		this.type = type;
		this.serviceType = serviceType;
		this.uid = uid;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @return the remoteUrl
	 */
	public String getRemoteUrl() {
		return remoteUrl;
	}

	/**
	 * @param remoteUrl the remoteUrl to set
	 */
	public void setRemoteUrl(String remoteUrl) {
		this.remoteUrl = remoteUrl;
	}

	/**
	 * @return the type
	 */
	public RepositoryType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(RepositoryType type) {
		this.type = type;
	}

	/**
	 * @return the serviceType
	 */
	public WebRepositoryType getServiceType() {
		return serviceType;
	}

	/**
	 * @param serviceType the serviceType to set
	 */
	public void setServiceType(WebRepositoryType serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * @param uid the uid to set
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * @return the committers
	 */
	public List<Committer> getCommitters() {
		return committers;
	}

	/**
	 * @param committers the committers to set
	 */
	public void setCommitters(List<Committer> committers) {
		this.committers = committers;
	}

	/**
	 * @return the trees
	 */
	public List<Tree> getTrees() {
		return trees;
	}

	/**
	 * @param trees the trees to set
	 */
	public void setTrees(List<Tree> trees) {
		this.trees = trees;
	}

	/**
	 * @return the project
	 */
	public Project getProject() {
		return project;
	}

	/**
	 * @param project the project to set
	 */
	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Repository other = (Repository) obj;
		if (id != other.id)
			return false;
		return true;
	}	
	
}